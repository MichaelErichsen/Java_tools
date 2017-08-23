/**
 * 
 */
package net.myerichsen.krabsen;

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
 * @version 14. 01. 2012
 * <p>
 * </td><td>(.*)</td><td bgcolor
 */
public class PlaceAnnotator extends JCasAnnotator_ImplBase {
	private Pattern[] mPatterns;
	Logger logger = null;
	Level level = Level.INFO;

	/**
	 * 0-argument constructor needed to be instantiated by the framework
	 */
	public PlaceAnnotator() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.uima.analysis_component.AnalysisComponent_ImplBase#initialize(org.apache.uima.UimaContext)
	 */
	@Override
	public void initialize(UimaContext aContext)
	throws ResourceInitializationException {
		super.initialize(aContext);

		logger = aContext.getLogger();
		logger.setLevel(Level.OFF);

		// Get configuration parameter values
		String[] patternStrings = (String[]) aContext
		.getConfigParameterValue("Patterns");

		// Compile regular expressions
		mPatterns = new Pattern[patternStrings.length];
		for (int i = 0; i < patternStrings.length; i++) {
			mPatterns[i] = Pattern.compile(patternStrings[i]);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.uima.analysis_component.JCasAnnotator_ImplBase#process(org.apache.uima.jcas.JCas)
	 */
	@Override
	public void process(JCas aJCas) throws AnalysisEngineProcessException {
		logger.log(level, "Entering");

		// Get document text
		String docText = aJCas.getDocumentText();

		// Iterate all patterns
		for (int i = 0; i < mPatterns.length; i++) {

			// Search for each record pattern
			Matcher matcher = mPatterns[i].matcher(docText);
			int pos = 0;
			PlaceNameType pn = null;

			while (matcher.find(pos)) {
				logger.log(level, matcher.group());

				PlaceType annotation = new PlaceType(aJCas);
				annotation.setBegin(matcher.start() + 9);
				annotation.setEnd(matcher.end() - 16);
				pn = new PlaceNameType(aJCas, matcher.start(), matcher.end());
				annotation.setPlaceName(pn);

				annotation.addToIndexes();
				logger.log(level, annotation.getBegin() + ", "
						+ annotation.getEnd() + ", "
						+ annotation.getCoveredText());

				pos = matcher.end();
			}
		}
	}
}
