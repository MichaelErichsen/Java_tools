/**
 * 
 */
package net.myerichsen.nogn;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import net.myerichsen.gedcom.SourceRecType;

import org.apache.uima.UimaContext;
import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.cas.StringArray;
import org.apache.uima.resource.ResourceInitializationException;
import org.apache.uima.util.Level;
import org.apache.uima.util.Logger;

/**
 * @author Michael Erichsen
 * @version 1.0, 19. 12. 2011
 */
public class SourceAnnotator extends JCasAnnotator_ImplBase {
	private Pattern[] mPatterns;
	Logger logger = null;
	Level level = Level.INFO;

	/**
	 * 0-argument constructor needed to be instantiated by the framework
	 */
	public SourceAnnotator() {
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
			mPatterns[i] = Pattern
			.compile(patternStrings[i], Pattern.MULTILINE);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.uima.analysis_component.JCasAnnotator_ImplBase#process(org.apache.uima.jcas.JCas)
	 */
	@Override
	public void process(JCas aJCas) throws AnalysisEngineProcessException {
		Matcher matcher = null;

		logger.log(level, "Entering");

		// Get document text
		String docText = aJCas.getDocumentText();

		// Iterate all patterns
		for (int i = 0; i < mPatterns.length; i++) {

			// Search for first record pattern
			matcher = mPatterns[i].matcher(docText);
			int pos = 0;

			if (matcher.find(pos)) {
				logger.log(level, pos + ": " + matcher.group());
				SourceRecType annotation = new SourceRecType(aJCas);
				annotation.setBegin(matcher.start() + 9);
				annotation.setEnd(matcher.end() - 13);
				annotation.setId("SR00001");
				annotation.setSourceType("Probate extract");
				annotation.setLanguage("da");
				annotation.setTitle("Erik Reinert Nielsens genealogiske sider");
				annotation.setAuthor("Erik Reinert Nielsen");
				annotation.setURI(new StringArray(aJCas, 1));
				annotation.setURI(0, "http://www.nogn.dk");
				annotation.addToIndexes();

				logger.log(level, annotation.getBegin() + ", "
						+ annotation.getEnd() + ", "
						+ annotation.getCoveredText());
			}
		}
	}
}