package net.myerichsen.nogn;

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
 * @version 1.0, 19. 12. 2011
 *          <p>
 *          Eksempel: <img src="nixi.gif" border="0"></a></TD>
 *          <TD>&nbsp;&nbsp;</TD>
 *          <TD>&nbsp;&nbsp;</TD>
 *          <TD>&nbsp;Peder&nbsp;</TD>
 *          <TD>&nbsp;Larsen&nbsp;</TD>
 *          </TR>
 *          <TR>
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
		int individualCounter = 0;
		IndividualRecType individual = null;
		IndivNameType in = null;
		String localPattern = "</TD>\\r\\n<TD>";
		String[] sa = null;
		Pattern subPattern = null;
		Matcher matcher = null;
		Matcher localMatcher = null;

		logger.log(level, "Entering");

		// Get document text
		String docText = aJCas.getDocumentText();

		// Iterate all patterns
		for (int i = 0; i < mPatterns.length; i++) {

			// Search for each record pattern
			matcher = mPatterns[i].matcher(docText);
			int pos = 0;

			while (matcher.find(pos)) {
				logger.log(level, matcher.group());

				// Delt i nixi, fornavn, efternavn, fornavn, efternavn
				sa = matcher.group().split(localPattern);

				if ((sa[1].equalsIgnoreCase("&nbsp;&nbsp;"))
						&& (sa[2].equalsIgnoreCase("&nbsp;&nbsp;"))
						&& (sa[3].equalsIgnoreCase("&nbsp;&nbsp;"))
						&& (sa[4].equalsIgnoreCase("&nbsp;&nbsp;"))) {
					pos = matcher.end();
					continue;
				}

				if ((sa[1].equalsIgnoreCase("&nbsp;&nbsp;") == false)
						|| (sa[2].equalsIgnoreCase("&nbsp;&nbsp;") == false)) {
					subPattern = Pattern.compile(sa[1] + localPattern + sa[2]);
					localMatcher = subPattern.matcher(docText);

					if (localMatcher.find(pos)) {
						logger.log(level, localMatcher.group());

						individual = new IndividualRecType(aJCas);
						individual.setBegin(localMatcher.start());
						individual.setEnd(localMatcher.end());
						individual.setId("IN"
								+ String.format("%05d", individualCounter++));
						in = new IndivNameType(aJCas);
						in.setBegin(localMatcher.start());
						in.setEnd(localMatcher.end());
						in.setLanguage("da");
						in.setIndNameType("given");
						individual.setIndivName(new FSArray(aJCas, 1));
						individual.setIndivName(0, in);

						individual.addToIndexes();
					}
				}

				if ((sa[3].equalsIgnoreCase("&nbsp;&nbsp;") == false)
						|| (sa[4].equalsIgnoreCase("&nbsp;&nbsp;") == false)) {
					subPattern = Pattern.compile(sa[3] + localPattern + sa[4]);
					localMatcher = subPattern.matcher(docText);

					if (localMatcher.find(pos)) {
						logger.log(level, localMatcher.group());

						individual = new IndividualRecType(aJCas);
						individual.setBegin(localMatcher.start());
						individual.setEnd(localMatcher.end());
						individual.setId("IN"
								+ String.format("%05d", individualCounter++));
						in = new IndivNameType(aJCas);
						in.setBegin(localMatcher.start());
						in.setEnd(localMatcher.end());
						in.setLanguage("da");
						in.setIndNameType("given");
						individual.setIndivName(new FSArray(aJCas, 1));
						individual.setIndivName(0, in);

						individual.addToIndexes();
					}
				}
				pos = matcher.end();
			}
		}
	}
}