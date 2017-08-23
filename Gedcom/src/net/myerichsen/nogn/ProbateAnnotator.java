package net.myerichsen.nogn;

import java.util.Iterator;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import net.myerichsen.gedcom.CitationType;
import net.myerichsen.gedcom.DateType;
import net.myerichsen.gedcom.EventRecType;
import net.myerichsen.gedcom.EvidenceType;
import net.myerichsen.gedcom.ExtractType;
import net.myerichsen.gedcom.IndividualRecType;
import net.myerichsen.gedcom.ParticipantType;
import net.myerichsen.gedcom.PlaceType;
import net.myerichsen.gedcom.SourceRecType;

import org.apache.uima.UimaContext;
import org.apache.uima.analysis_component.AnalysisComponent;
import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.cas.FSIndex;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.tcas.Annotation;
import org.apache.uima.resource.ResourceInitializationException;
import org.apache.uima.util.Level;
import org.apache.uima.util.Logger;

/**
 * @author Michael Erichsen
 * @version 1.0, 19. 12. 2011
 */
public class ProbateAnnotator extends JCasAnnotator_ImplBase {
	private Pattern[] mPatterns;
	Logger logger = null;
	Level level = Level.INFO;

	/**
	 * no-arg c:tor is needed to be instantiated by the framework
	 */
	public ProbateAnnotator() {
	}

	/**
	 * @see AnalysisComponent#initialize(UimaContext)
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

	/**
	 * @see JCasAnnotator_ImplBase#process(JCas)
	 */
	@Override
	public void process(JCas aJCas) {
		Matcher matcher = null;
		EventRecType event = null;
		int idCounter = 1;

		logger.log(level, "Entering");

		// Get document text
		String docText = aJCas.getDocumentText();

		// Iterate all patterns
		for (int i = 0; i < mPatterns.length; i++) {

			// Search for each record pattern
			matcher = mPatterns[i].matcher(docText);
			int pos = 0;

			while (matcher.find(pos)) {
				logger.log(level, matcher.start() + ", " + matcher.end() + ", "
						+ matcher.group());

				event = createEvent(aJCas, idCounter++, matcher.start(),
						matcher.end());

				event.addToIndexes();

				pos = matcher.end();
			}

		}
	}

	/**
	 * Create a single probate event
	 * 
	 * @param aJCas
	 * @param start
	 * @param end
	 * @param sourceFile
	 * @return
	 */
	private EventRecType createEvent(JCas aJCas, int idCounter, int minBegin,
			int maxEnd) {
		FSIndex<Annotation> sourceIndex = aJCas
		.getAnnotationIndex(SourceRecType.type);
		Iterator<Annotation> sourceIter = null;
		SourceRecType source = null;

		FSIndex<Annotation> nameIndex = aJCas
		.getAnnotationIndex(IndividualRecType.type);
		Iterator<Annotation> nameIter = null;
		IndividualRecType name = null;

		FSIndex<Annotation> placeIndex = aJCas
		.getAnnotationIndex(PlaceType.type);
		Iterator<Annotation> placeIter = null;
		PlaceType place = null;

		FSIndex<Annotation> dateIndex = aJCas.getAnnotationIndex(DateType.type);
		Iterator<Annotation> dateIter = null;
		DateType date = null;

		EventRecType event = null;

		ParticipantType p = null;
		Vector<ParticipantType> pv = new Vector<ParticipantType>();
		Vector<IndividualRecType> indV = new Vector<IndividualRecType>();
		FSArray participants = null;
		FSArray individuals = null;

		CitationType citation = null;
		FSArray citations = null;
		ExtractType extract = null;
		FSArray extracts = null;
		EvidenceType evidence = null;
		FSArray evidences = null;

		int nIndex = 0;

		logger.log(level, "Entering");

		// Create a new probate event
		event = new EventRecType(aJCas);
		event.setId("PR" + String.format("%05d", idCounter++));
		event.setEventType("will probate");
		event.setVitalType("death");
		event.setBegin(minBegin);
		event.setEnd(maxEnd);

		// Get the source
		sourceIter = sourceIndex.iterator();

		if (sourceIter.hasNext())
			source = (SourceRecType) sourceIter.next();
		else {
			System.out.println("Source ikke fundet af annotator");
			System.exit(16);
		}

		event.setSource(source.getCoveredText().trim());

		// Get the name of the principal
		nameIter = nameIndex.iterator();
		pv.clear();
		nIndex = 0;
		indV = new Vector<IndividualRecType>();

		while (nameIter.hasNext()) {
			name = (IndividualRecType) nameIter.next();
			// logger.log(level, name.getCoveredText());
			if (name.getBegin() < minBegin)
				continue;

			if (name.getBegin() >= maxEnd)
				break;

			if (nIndex == 0) {
				p = new ParticipantType(aJCas, name.getBegin(), name.getEnd());
				p.setLiving("N");
				p.setRole("Principal");
			} else {
				p = new ParticipantType(aJCas, name.getBegin(), name.getEnd());
				p.setRole("Witness");
			}

			pv.add(p);
			indV.add(name);
			nIndex++;
		}

		participants = new FSArray(aJCas, pv.size());
		int index = 0;
		for (Iterator<ParticipantType> iterator = pv.iterator(); iterator
		.hasNext();) {
			participants.set(index++, iterator.next());
		}

		individuals = new FSArray(aJCas, index);
		index = 0;
		for (Iterator<IndividualRecType> iteratorI = indV.iterator(); iteratorI
		.hasNext();) {
			individuals.set(index++, iteratorI.next());
		}

		event.setParticipant(participants);

		// Get the place
		placeIter = placeIndex.iterator();
		while (placeIter.hasNext()) {
			place = (PlaceType) placeIter.next();
			if (place.getBegin() < minBegin)
				continue;

			if (place.getBegin() > maxEnd)
				break;

			event.setPlace(place);
		}

		// Get the date
		dateIter = dateIndex.iterator();
		while (dateIter.hasNext()) {
			date = (DateType) dateIter.next();

			if (date.getBegin() > minBegin)
				continue;

			if (date.getBegin() > maxEnd)
				break;

			event.setDate(date.getCoveredText());
			event.setToDate(date.getCoveredText());
		}

		extract = new ExtractType(aJCas);
		extract.setBegin(minBegin);
		extract.setEnd(maxEnd);
		extract.setLanguage("dk");
		extracts = new FSArray(aJCas, 1);
		extracts.set(0, extract);
		citation = new CitationType(aJCas);
		if (date.getCoveredText() != null)
			citation.setWhenRecorded(date.getCoveredText());
		citation.setExtract(extracts);
		citation.setCaption("Erik Reinert Nielsen skifteuddrag");
		citations = new FSArray(aJCas, 1);
		citations.set(0, citation);
		evidence = new EvidenceType(aJCas);
		evidence.setCitation(citations);
		evidences = new FSArray(aJCas, 1);
		evidences.set(0, evidence);
		event.setEvidence(evidences);

		event.setBegin(minBegin);
		event.setEnd(maxEnd);

		logger.log(level, event.getBegin() + ", " + event.getEnd() + ", "
				+ event.getCoveredText());

		return event;
	}
}