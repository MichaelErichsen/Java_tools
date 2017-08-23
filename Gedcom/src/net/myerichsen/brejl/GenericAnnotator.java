/**
 * 
 */
package net.myerichsen.brejl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import net.myerichsen.gedcom.DateType;
import net.myerichsen.gedcom.IndivNameType;
import net.myerichsen.gedcom.IndividualRecType;
import net.myerichsen.gedcom.PlaceNameType;
import net.myerichsen.gedcom.PlaceType;
import net.myerichsen.gedcom.ProbateSignature; // import
//net.myerichsen.gedcom.SourceRecType;

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
 * @version 1.0, 28. 11. 2011
 */
public class GenericAnnotator extends JCasAnnotator_ImplBase {
	private Pattern[] mPatterns;
	private String[] mRecordTypes;
	Logger logger = null;
	Level level = Level.INFO;

	/**
	 * 0-argument constructor needed to be instantiated by the framework
	 */
	public GenericAnnotator() {
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
	 * @see org.apache.uima.analysis_component.JCasAnnotator_ImplBase#process(org.apache.uima.jcas.JCas)
	 */
	@Override
	public void process(JCas aJCas) throws AnalysisEngineProcessException {
		int individualCounter = 0;

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
				if (mRecordTypes[i].equals("Name")) {
//					logger.log(level, matcher.start() + ", " + matcher.end()
//							+ ", " + matcher.group());
					IndividualRecType individual = new IndividualRecType(aJCas);
					individual.setBegin(matcher.start());
					individual.setEnd(matcher.end());
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
					pos = matcher.end();
				}

				else if (mRecordTypes[i].equals("Date")) {
//					logger.log(level, matcher.start() + ", " + matcher.end()
//							+ ", " + matcher.group());
					DateType date = new DateType(aJCas);
					date.setBegin(matcher.start());
					if (docText.charAt(matcher.start()) == '.')
						date.setBegin(matcher.start() + 1);
					date.setEnd(matcher.end());
					date.setCalendar("Gregorian");
					date.addToIndexes();
					pos = matcher.end();
				}

				else if (mRecordTypes[i].equals("Place")) {
//					logger.log(level, matcher.start() + ", " + matcher.end()
//							+ ", " + matcher.group());
					PlaceType annotation = new PlaceType(aJCas);

					if ("i".equalsIgnoreCase(matcher.group().substring(0, 1)))
						annotation.setBegin(matcher.start() + 2);
					else if ("på".equalsIgnoreCase(matcher.group().substring(0,
							2)))
						annotation.setBegin(matcher.start() + 3);
					else if ("ved".equalsIgnoreCase(matcher.group().substring(
							0, 3)))
						annotation.setBegin(matcher.start() + 4);

					annotation.setEnd(matcher.end());
					pn = new PlaceNameType(aJCas, matcher.start() + 2, matcher
							.end());
					annotation.setPlaceName(pn);
					annotation.addToIndexes();
					pos = matcher.end();
				}

				else if (mRecordTypes[i].equals("ProbateSignature")) {
					logger.log(level, matcher.start() + ", " + matcher.end()
							+ ", " + matcher.group());
					ProbateSignature annotation = new ProbateSignature(aJCas);
					annotation.setBegin(matcher.start());
					annotation.setEnd(matcher.end());
					annotation.addToIndexes();
					pos = matcher.end();
				}
			}
		}
	}
}