package dk.gribskovseniorcenter.medlemskort;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Node;

import com.jacob.activeX.ActiveXComponent;
import com.jacob.com.ComThread;
import com.jacob.com.Dispatch;
import com.jacob.com.Variant;

/**
 * @author michael
 *
 */

public class Medlem {
	private String medlemsId;
	private String navn;
	private String adresse;
	private String postnr;
	private String postnr_by;

	/**
	 * No arg constructor
	 */
	public Medlem() {
		super();
	}

	/**
	 * @return
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * @return
	 */
	public String getMedlemsId() {
		return medlemsId;
	}

	/**
	 * @return
	 */
	public String getNavn() {
		return navn;
	}

	/**
	 * @return
	 */
	public String getPostnr() {
		return postnr;
	}

	/**
	 * @return
	 */
	public String getPostnr_by() {
		return postnr_by;
	}

	/**
	 * @param medlemsid
	 * @return
	 * @throws Exception
	 */
	public String hentFraConventus(String medlemsid) throws Exception {
		String data;
		StringBuffer sb = new StringBuffer();
		String response = "";

		URL url = new URL(Messages.Medlemskort_Conventus_Url);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setDoOutput(true);
		conn.setRequestMethod("GET");

		OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());

		data = URLEncoder.encode("forening", "UTF-8") + "=" + URLEncoder.encode(Messages.Medlemskort_Forening, "UTF-8");
		data += "&" + URLEncoder.encode("key", "UTF-8") + "=" + URLEncoder.encode(Messages.Medlemskort_Noegle, "UTF-8");
		data += "&" + URLEncoder.encode("id", "UTF-8") + "=" + URLEncoder.encode(medlemsid, "UTF-8");

		// Send data
		wr.write(data);
		wr.flush();

		BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));

		String line;

		while ((line = rd.readLine()) != null) {
			sb.append(line);
		}

		response = sb.toString();

		wr.close();
		rd.close();

		return response;
	}

	/**
	 * @param workbook
	 * @throws Exception
	 */
	public void indsaetIExcel(String workbook) throws Exception {

		InputStream inp = new FileInputStream(workbook);

		Workbook wb = WorkbookFactory.create(inp);
		Sheet sheet = wb.getSheetAt(0);
		try {
			sheet.removeRow(sheet.getRow(1));
		} catch (Exception e) {
			// Do nothing
		}

		Row row = sheet.createRow(1);

		Cell cell = row.createCell(0);
		cell.setCellType(CellType.STRING);
		cell.setCellValue(getMedlemsId());

		cell = row.createCell(1);
		cell.setCellType(CellType.STRING);
		cell.setCellValue(getNavn());

		cell = row.createCell(2);
		cell.setCellType(CellType.STRING);
		cell.setCellValue(getAdresse());

		cell = row.createCell(3);
		cell.setCellType(CellType.STRING);
		cell.setCellValue(getPostnr());

		cell = row.createCell(4);
		cell.setCellType(CellType.STRING);
		cell.setCellValue(getPostnr_by());

		// Write the output to a file
		FileOutputStream fileOut = new FileOutputStream(workbook);
		wb.write(fileOut);
		fileOut.close();

	}

	/**
	 * @param response
	 * @throws Exception
	 */
	public String parseXml(String response) throws Exception {
		Document document = DocumentHelper.parseText(response);

		Node node = document.selectSingleNode("//conventus/medlem/id");

		if (node == null) {
			node = document.selectSingleNode("//conventus/error");
			if (node == null) {
				return "Medlem ikke fundet";
			}
			return "Fejl fra Conventus: " + node.getText();
		}

		setMedlemsId(node.getText());

		node = document.selectSingleNode("//conventus/medlem/navn");
		setNavn(node.getText());
		node = document.selectSingleNode("//conventus/medlem/adresse1");

		Node node2 = document.selectSingleNode("//conventus/medlem/adresse2");
		setAdresse(node.getText() + node2.getText());

		node = document.selectSingleNode("//conventus/medlem/postnr");
		setPostnr(node.getText());

		node = document.selectSingleNode("//conventus/medlem/postnr_by");
		setPostnr_by(node.getText());

		return "Medlem er hentet fra Conventus";
	}

	/**
	 * @param adresse
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/**
	 * @param medlemsId
	 */
	public void setMedlemsId(String medlemsId) {
		this.medlemsId = medlemsId;
	}

	/**
	 * @param navn
	 */
	public void setNavn(String navn) {
		this.navn = navn;
	}

	/**
	 * @param postnr
	 */
	public void setPostnr(String postnr) {
		this.postnr = postnr;
	}

	/**
	 * @param postnr_by
	 */
	public void setPostnr_by(String postnr_by) {
		this.postnr_by = postnr_by;
	}

	/**
	 * @param pTouchTemplate
	 * @return
	 */
	public synchronized String udskrivPtouch(String pTouchTemplate) {
		Variant v;

		try {
			ActiveXComponent axc = new ActiveXComponent("bpac.Document");

			v = Dispatch.call(axc, "Open", pTouchTemplate);
			boolean b = v.getBoolean();
			if (b == false) {
				System.out.println("Open mislykkedes");
				return "Kan ikke printe herfra - gå til P-touch og skriv ud";
			}

			// v = Dispatch.call(axc, "GetPrinterName");
			// System.out.println("Printer name: " + v.getString());

			// v = Dispatch.call(axc, "GetTextCount");
			// System.out.println("Text Count " + v.getInt());

			// v = Dispatch.call(axc, "GetObject", "id");
			// System.out.println("Id " + this.toStringType(v.getvt()));

			v = Dispatch.call(axc, "StartPrint", "", 0);
			v = axc.getProperty("ErrorCode");
			if (v.getInt() != 0) {
				System.out.println("P-touch StartPrint fejl " + v.getInt());
				return "Kan ikke printe herfra - gå til P-touch og skriv ud";
			}

			v = Dispatch.call(axc, "PrintOut", 1, 0);
			v = axc.getProperty("ErrorCode");
			if (v.getInt() != 0) {
				System.out.println("P-touch PrintOut fejl " + v.getInt());
				return "Kan ikke printe herfra - gå til P-touch og skriv ud";
			}

			v = Dispatch.call(axc, "EndPrint");
			if (v.getBoolean() == false) {
				System.out.println("P-touch EndPrint mislykkedes");
				return "Kan ikke printe herfra - gå til P-touch og skriv ud";
			}

			v = Dispatch.call(axc, "Close");
			b = v.getBoolean();
			if (b == false) {
				System.out.println("Close mislykkedes");
				return "Kan ikke printe herfra - gå til P-touch og skriv ud";
			}
		} catch (Exception e) {
			e.printStackTrace();
			return "Kan ikke printe herfra - gå til P-touch og skriv ud";
		}

		finally {
			// invoke the method to count down the numbers of the reference,
			// and release them one by one to kill the excel process finally.
			ComThread.Release();

		}
		return "Medlem er kopieret til Excel og udskrevet";
	}

	/**
	 * translate a short Variant Type Definition to a String
	 * (string,empty,null,short ...)
	 * 
	 * @param type
	 * @return String Variant Type
	 */
	// public static String toStringType(short type) {
	// if (type == Variant.VariantEmpty)
	// return "empty";
	// else if (type == Variant.VariantNull)
	// return "null";
	// else if (type == Variant.VariantShort)
	// return "Short";
	// else if (type == Variant.VariantInt)
	// return "Integer";
	// else if (type == Variant.VariantFloat)
	// return "Float";
	// else if (type == Variant.VariantDouble)
	// return "Double";
	// else if (type == Variant.VariantCurrency)
	// return "Currency";
	// else if (type == Variant.VariantDate)
	// return "Date";
	// else if (type == Variant.VariantString)
	// return "String";
	// else if (type == Variant.VariantBoolean)
	// return "Boolean";
	// else if (type == Variant.VariantByte)
	// return "Byte";
	// else if (type == Variant.VariantArray)
	// return "Array";
	// else if (type == Variant.VariantDispatch)
	// return "Dispatch";
	// else if (type == Variant.VariantByref)
	// return "Byref";
	// else if (type == Variant.VariantCurrency)
	// return "Currency";
	// else if (type == Variant.VariantError)
	// return "Error";
	// else if (type == Variant.VariantInt)
	// return "int";
	// else if (type == Variant.VariantObject)
	// return "Object";
	// else if (type == Variant.VariantTypeMask)
	// return "TypeMask";
	// else if (type == Variant.VariantVariant)
	// return "Variant";
	// else
	// return "unknown";
	// }
}
