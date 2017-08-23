package net.myerichsen.kermit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;

import net.myerichsen.dbutil.SqlConstants;
import net.myerichsen.fonkod.Fonkod;
import net.myerichsen.gedcom.EventRecType;
import net.myerichsen.gedcom.IndividualRecType;

import org.apache.uima.UimaContext;
import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.FSIndex;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.tcas.Annotation;
import org.apache.uima.resource.ResourceInitializationException;
import org.apache.uima.util.Level;
import org.apache.uima.util.Logger;

/**
 * @author Michael Erichsen
 * @version 1.1, 23. 04. 2013
 */
public class DerbyCasConsumer extends JCasAnnotator_ImplBase {
	private static final String CURRENT_SQLID = "SET CURRENT SQLID = GEDCOM";
	private static final String INSERT_EVENT = "INSERT INTO EVENT(ID, FROMDATE, TODATE, "
			+ "PLACE, EVENTTYPE, VITALTYPE, COVERED_DATA, SOURCE, CAPTION) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
	private static final String INSERT_INDIVIDUAL = "INSERT INTO INDIVIDUAL"
			+ "(ID, NAME, FONKOD, EVENT_ID, SOURCE) VALUES (?, ?, ?, ?, ?)";
	private static final String SELECT_COUNT_E = "SELECT COUNT(*) FROM EVENT";
	private static final String SELECT_COUNT_I = "SELECT COUNT(*) FROM INDIVIDUAL";
	private Logger logger = null;
	private static final Level level = Level.INFO;
	private Connection conn;

	/**
	 * No arg c:tor needed to be instantiated by the framework
	 */
	public DerbyCasConsumer() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.apache.uima.analysis_component.AnalysisComponent_ImplBase#destroy()
	 */
	@Override
	public void destroy() {
		ResultSet rs = null;
		Statement st = null;

		// logger.log(level, "Entering");

		try {
			st = conn.createStatement();
			rs = st.executeQuery(SELECT_COUNT_E);

			while (rs.next())
				System.out.println("Event " + rs.getString(1).trim());

			rs = st.executeQuery(SELECT_COUNT_I);

			while (rs.next())
				System.out.println("Individual " + rs.getString(1).trim());

			DriverManager.getConnection(SqlConstants.SHUTDOWN);
			conn.close();
		} catch (SQLException e) {
			logger.log(level, e.getMessage());
		}

		super.destroy();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.apache.uima.analysis_component.AnalysisComponent_ImplBase#initialize
	 * (org.apache.uima.UimaContext)
	 */
	@Override
	public void initialize(UimaContext context)
			throws ResourceInitializationException {
		Statement st;
		logger = context.getLogger();
		logger.setLevel(Level.INFO);

		try {
			Class.forName(SqlConstants.DBDRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.exit(16);
		}

		try {
			conn = DriverManager.getConnection(SqlConstants.DBNAMET);
			st = conn.createStatement();
			st.execute(CURRENT_SQLID);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		super.initialize(context);
	}

	/**
	 * @param coveredText
	 * @return
	 */
	private String parseCoveredText(String coveredText) {
		coveredText = coveredText.replaceAll("&nbsp;", " ");
		coveredText = coveredText.replaceAll("</p>", "\\r\\n");
		coveredText = coveredText.replaceAll("<.*?>", " ");
		coveredText = coveredText.replaceAll("  ", " ");
		return coveredText;
	}

	private String parseNames(String inputName) {
		String[] ignore = { "MsoNormal", "TableType", "CellType", "ContentBody" };

		String[] remove = { "Paarørende", "Farbroderen", "Farbroder",
				"Farbror", "Morbroderen", "Morbroder", "Morbror",
				"Stiffaderen", "Stiffader", "Afdøde", "Farbrødrene", "Faderen",
				"Fader", "Farfar", "Morfar", "Dægnen", "Sødskende", "Broderen",
				"Broder", "Bror", "Søsteren", "Søster", "Sønnen", "Søn ",
				"Enkens", "Enken", "Salig", "Sal.", "Sal ", "Mosteren",
				"Moster", "Fasteren", "Faster" };

		for (String string : ignore) {
			if (inputName.trim().equals(string))
				return null;
		}

		String name = inputName.replaceAll("\\r\\n", "");
		for (String iString : remove) {
			name = name.replaceFirst(iString, "");
		}

		return name.trim();
	}

	/**
	 * @param event
	 * @return
	 */
	private String parseSource(EventRecType event) {
		String source;
		source = event.getSource();
		source = source.replaceAll("<.*?>", " ");
		source = source.replaceAll("&nbsp;", " ");
		source = source.replaceAll("\\s+", " ");
		if (source.length() > 100)
			source = source.substring(0, 99);
		logger.log(level, "Source: " + source);
		return source;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.apache.uima.analysis_component.JCasAnnotator_ImplBase#process(org
	 * .apache.uima.jcas.JCas)
	 */
	@Override
	public void process(JCas cas) throws AnalysisEngineProcessException {
		EventRecType event;
		IndividualRecType individual;
		String name;
		String place;
		String coveredText;
		String logString;
		String source;
		PreparedStatement pse;
		PreparedStatement psi;
		Fonkod fk = new Fonkod();
		int begin = 0;
		int end = 0;

		// logger.log(level, "Entering");

		fk.setLogLevel("INFO");

		FSIndex<Annotation> eventIndex = cas
				.getAnnotationIndex(EventRecType.type);
		Iterator<Annotation> eventIter = eventIndex.iterator();

		FSIndex<Annotation> individualIndex = cas
				.getAnnotationIndex(IndividualRecType.type);

		while (eventIter.hasNext()) {
			event = (EventRecType) eventIter.next();
			coveredText = event.getEvidence(0).getCitation(0).getExtract(0)
					.getCoveredText().trim();
			coveredText = parseCoveredText(coveredText);

			logString = (coveredText.length() > 80 ? coveredText.substring(0,
					77) + "..." : coveredText);

			try {
				pse = conn.prepareStatement(INSERT_EVENT);

				pse.setString(1, event.getId());

				if (event.getDate() == null) {
					logger.log(level, "From date is null: " + logString);
					pse.setString(2, "0001-01-01");
				} else
					pse.setString(2, event.getDate());

				if (event.getToDate() == null) {
					logger.log(level, "To date is null: " + logString);
					pse.setString(3, "9999-12-31");
				} else
					pse.setString(3, event.getToDate());

				if (event.getPlace() == null) {
					logger.log(level, "Place is null: " + logString);
					pse.setString(4, "?");
				} else {
					place = event.getPlace().getCoveredText();
					place = place.replaceAll("\\r\\n", "");
					pse.setString(4, place.trim());
				}

				pse.setString(5, event.getEventType());

				pse.setString(6, event.getVitalType());

				if (coveredText.length() > 3597)
					coveredText = coveredText.substring(0, 3596) + "...";
				pse.setString(7, coveredText);

				if (event.getSource() == null)
					pse.setString(8, "???");
				else {
					source = parseSource(event);
					pse.setString(8, source);
				}
				pse.setString(9, event.getEvidence(0).getCitation(0)
						.getCaption());

				pse.executeUpdate();
			} catch (SQLException e1) {
				System.err.println(e1.getMessage());
			}

			end = event.getEnd();

			Iterator<Annotation> individualIter = individualIndex.iterator();

			while (individualIter.hasNext()) {
				individual = (IndividualRecType) individualIter.next();

				if (individual.getBegin() < begin)
					continue;

				if (individual.getEnd() > end)
					break;

				// logger.log(
				// level,
				// individual.getId() + " " + individual.getBegin() + ", "
				// + individual.getEnd() + ", "
				// + individual.getCoveredText());

				try {
					psi = conn.prepareStatement(INSERT_INDIVIDUAL);

					psi.setString(1, individual.getId());

					name = individual.getCoveredText().trim();
					name = parseNames(name);
					if (name == null) {
						continue;
					}

					if (name.length() > 100)
						name = name.substring(0, 99);
					psi.setString(2, name);

					try {
						psi.setString(3, fk.generateKey(name));
					} catch (Exception e) {
						logger.log(level, e.getMessage());
						continue;
					}

					psi.setString(4, event.getId());

					if (event.getSource() == null)
						psi.setString(5, "???");
					else {
						source = parseSource(event);
						psi.setString(5, source);
					}

					psi.executeUpdate();
				} catch (SQLException e) {
					System.err.println(e.getMessage());
				}
			}
			try {
				conn.commit();
			} catch (SQLException e) {
				System.err.println(e.getMessage());
			}
			begin = end;
		}
	}
}