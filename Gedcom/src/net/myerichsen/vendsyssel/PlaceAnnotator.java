/**
 * 
 */
package net.myerichsen.vendsyssel;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import net.myerichsen.gedcom.PlaceNameType;
import net.myerichsen.gedcom.PlaceType;

import org.apache.uima.UimaContext;
import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.jcas.JCas;
import org.apache.uima.resource.ResourceInitializationException;
import org.apache.uima.util.Level;
import org.apache.uima.util.Logger;

/**
 * @author Michael Erichsen
 * @version 1.2, 05. 05. 2013
 */
public class PlaceAnnotator extends JCasAnnotator_ImplBase {
	private Pattern[] mPatterns;
	Logger logger = null;
	Level level = Level.SEVERE;

	/**
	 * 0-argument constructor needed to be instantiated by the framework
	 */
	public PlaceAnnotator() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.apache.uima.analysis_component.AnalysisComponent_ImplBase#initialize
	 * (org.apache.uima.UimaContext)
	 */
	@Override
	public void initialize(UimaContext aContext)
			throws ResourceInitializationException {
		super.initialize(aContext);

		logger = aContext.getLogger();
		logger.setLevel(level);

		// Get configuration parameter values
		String[] patternStrings = (String[]) aContext
				.getConfigParameterValue("Patterns");

		// Compile regular expressions
		mPatterns = new Pattern[patternStrings.length];
		for (int i = 0; i < patternStrings.length; i++) {
			mPatterns[i] = Pattern.compile(patternStrings[i], Pattern.MULTILINE
					| Pattern.UNICODE_CASE);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.apache.uima.analysis_component.JCasAnnotator_ImplBase#process(org
	 * .apache.uima.jcas.JCas)
	 */
	@Override
	public void process(JCas aJCas) throws AnalysisEngineProcessException {
		// Get document text
		String docText = aJCas.getDocumentText();

		// Iterate all patterns
		for (int i = 0; i < mPatterns.length; i++) {

			// Search for each record pattern
			Matcher matcher = mPatterns[i].matcher(docText);
			int pos = 0;
			PlaceNameType pn = null;

			while (matcher.find(pos)) {
				PlaceType annotation = new PlaceType(aJCas);
				annotation.setBegin(matcher.start() + 2);
				annotation.setEnd(matcher.end());
				pn = new PlaceNameType(aJCas, matcher.start() + 2,
						matcher.end());
				annotation.setPlaceName(pn);
				annotation.addToIndexes();
				pos = matcher.end();

				logger.log(Level.INFO, "Place: " + annotation.getCoveredText());
			}
		}
	}
}
