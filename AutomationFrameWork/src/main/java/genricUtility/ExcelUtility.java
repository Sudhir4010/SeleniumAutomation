package genricUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * @author Sudhir
 */

public class ExcelUtility {
	/**
	 * This is method is used  to read String data from excel
	 * user must pass sheetname,rowIndex,columnIndex
	 * @param sheetName
	 * @param rowIndex
	 * @param colIndex
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String getSringDataFromExcel(String sheetName,int rowIndex,int colIndex) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/TestData/Selenium.xlsx");
		Workbook workbook =WorkbookFactory.create(fis);
		return workbook.getSheet(sheetName).getRow(colIndex).getCell(colIndex).getStringCellValue();
		
	}
	public boolean getBooleanDataFromExcel(String sheetName,int rowIndex,int colIndex) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/TestData/Selenium.xlsx");
		Workbook workbook =WorkbookFactory.create(fis);
		return workbook.getSheet(sheetName).getRow(colIndex).getCell(colIndex).getBooleanCellValue();
		
	}
	public double NumericDataFromExcel(String sheetName,int rowIndex,int colIndex) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/TestData/Selenium.xlsx");
		Workbook workbook =WorkbookFactory.create(fis);
		return workbook.getSheet(sheetName).getRow(colIndex).getCell(colIndex).getNumericCellValue();
		
	}

	public LocalDateTime getdateFromExcel(String sheetName,int rowIndex,int colIndex) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/TestData/Selenium.xlsx");
		Workbook workbook =WorkbookFactory.create(fis);
		return workbook.getSheet(sheetName).getRow(colIndex).getCell(colIndex).getLocalDateTimeCellValue();
		
	}



}
