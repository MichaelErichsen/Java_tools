/**
 * 
 */
package net.myerichsen.aurelia;

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
 * @version 1.0, 04. 12. 2011
 */
public class DateAnnotator extends JCasAnnotator_ImplBase {
	private Pattern[] mPatterns;
	private String[] mRecordTypes;
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
		mRecordTypes = (String[]) aContext
		.getConfigParameterValue("RecordTypes");

		// Compile regular expressions
		mPatterns = new Pattern[patternStrings.length];
		for (int i = 0; i < patternStrings.length; i++) {
			mPatterns[i] = Pattern.compile(patternStrings[i]);
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
		logger.log(level, "Entering");
		
		// Get document text
		String docText = aJCas.getDocumentText();

		// Iterate all patterns
		for (int i = 0; i < mPatterns.length; i++) {

			// Search for each record pattern
			Matcher matcher = mPatterns[i].matcher(docText);
			int pos = 0;

			while (matcher.find(pos)) {
//				logger.log(level, pos + ": " + matcher.group());
				
				// Found one - create annotation
				if ((mRecordTypes[i].equals("ddmmmyyyy"))
						|| (mRecordTypes[i].equals("ddSlashddmmmyyyy"))
						|| (mRecordTypes[i].equals("ddmmmSlashddmmmyyyy"))
						|| (mRecordTypes[i].equals("ddmmmyyyySlashddmmmyyyy"))
						|| (mRecordTypes[i].equals("yyyy"))) {
					DateType date = new DateType(aJCas);
					date.setBegin(matcher.start());
					if (docText.charAt(matcher.start()) == '.') 
						date.setBegin(matcher.start() + 1);
					date.setEnd(matcher.end());
					date.setCalendar("Gregorian");
					date.addToIndexes();
					pos = matcher.end();
				}
			}
		}
	}
}
