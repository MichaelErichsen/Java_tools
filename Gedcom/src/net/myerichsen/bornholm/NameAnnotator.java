/**
 * 
 */
package net.myerichsen.bornholm;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import net.myerichsen.gedcom.IndivNameType;
import net.myerichsen.gedcom.IndividualRecType;

import org.apache.uima.UimaContext;
import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.resource.ResourceInitializationException;
import org.apache.uima.util.Level;
import org.apache.uima.util.Logger;

/**
 * @author Michael Erichsen
 * @version 1.1, 24. 04. 2013
 */
public class NameAnnotator extends JCasAnnotator_ImplBase {
	private Pattern[] mPatterns;
	Logger logger = null;
	Level level = Level.INFO;

	/**
	 * no-arg c:tor needed to be instantiated by the framework
	 */
	public NameAnnotator() {
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
	 * @see
	 * org.apache.uima.analysis_component.JCasAnnotator_ImplBase#process(org
	 * .apache.uima.jcas.JCas)
	 */
	@Override
	public void process(JCas aJCas) throws AnalysisEngineProcessException {
		int individualCounter = 1;

		logger.log(level, "Entering");

		// Get document text
		String docText = aJCas.getDocumentText();

		// Iterate all patterns
		for (int i = 0; i < mPatterns.length; i++) {

			// Search for each record pattern
			Matcher matcher = mPatterns[i].matcher(docText);

			while (matcher.find()) {
				IndividualRecType individual = new IndividualRecType(aJCas);
				individual.setBegin(matcher.start());
				if (matcher.group(0).endsWith("?")) {
					individual.setEnd(matcher.end() - 1);
				} else {
					individual.setEnd(matcher.end());
				}

				individual.setId("IN"
						+ String.format("%05d", individualCounter++));
				IndivNameType in = new IndivNameType(aJCas);
				in.setBegin(matcher.start());
				in.setEnd(matcher.end());
				in.setLanguage("da");
				in.setIndNameType("given");
				individual.setIndivName(new FSArray(aJCas, 1));
				individual.setIndivName(0, in);

				individual.addToIndexes();
			}
		}
	}
}
