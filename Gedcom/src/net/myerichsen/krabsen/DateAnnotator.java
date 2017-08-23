package net.myerichsen.krabsen;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import net.myerichsen.gedcom.DateType;

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
 *          <p>
 *          <td bgcolor='#fbe1c0'>\d{2} \d{2} \d{4}</td>
 *          <p>
 *          Returns dd mm yyyy format
 */
public class DateAnnotator extends JCasAnnotator_ImplBase {
	private Pattern[] mPatterns;
	Logger logger = null;
	Level level = Level.INFO;

	/**
	 * no-arg c:tor needed to be instantiated by the framework
	 */
	public DateAnnotator() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.uima.analysis_component.AnalysisComponent_ImplBase#initialize
	 *      (org.apache.uima.UimaContext)
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
			mPatterns[i] = Pattern.compile(patternStrings[i],
					Pattern.CASE_INSENSITIVE);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.uima.analysis_component.JCasAnnotator_ImplBase#process(org
	 *      .apache.uima.jcas.JCas)
	 */
	@Override
	public void process(JCas aJCas) throws AnalysisEngineProcessException {
		Pattern p;
		Matcher m1;
		int ms = 0;

		logger.log(level, "Entering");

		// Get document text
		String docText = aJCas.getDocumentText();

		// Iterate all patterns
		for (int i = 0; i < mPatterns.length; i++) {

			// Search for each record pattern
			Matcher matcher = mPatterns[i].matcher(docText);
			int pos = 0;

			while (matcher.find(pos)) {
				logger.log(level, pos + ": " + matcher.group());
				ms = matcher.start();

				p = Pattern.compile("\\d{2} \\d{2} \\d{4}");
				m1 = p.matcher(matcher.group());
				
				if (m1.find()) {
					
				DateType date = new DateType(aJCas);
				date.setBegin(ms +m1.start());
				date.setEnd(ms + m1.end());
				date.setCalendar("Gregorian");
				date.addToIndexes();
				pos = matcher.end();
				}
			}
		}
	}
}