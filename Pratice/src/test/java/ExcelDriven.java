import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDriven {
	static String path;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public ExcelDriven(String excelPath, String sheetName)
	{
		try {
		
		 workbook=new XSSFWorkbook(excelPath);
		sheet=workbook.getSheet(sheetName);
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}
	public static void main(String[] args) {
	
		
		getProperty();
		getCellDataNumber(1,1);
		getCellDataString(0,0);
		
	}
	
	public static void getProperty()
	{
		
	
		try {
			
			int rows=sheet.getPhysicalNumberOfRows();
			System.out.println(rows);
			
		} catch (Exception exp) {
		
			// TODO Auto-generated catch block
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
	}
	public static void getCellDataString(int rowNum, int colNum)
	{

		try {
			
			String value=sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			System.out.println(value);
			
		} catch (Exception exp) {
		
			// TODO Auto-generated catch block
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		
	}

	public static void getCellDataNumber(int rowNum, int colNum)
	{

		try {
			 
			double value=sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			System.out.println(value);
			
		} catch (Exception exp) {
		
			// TODO Auto-generated catch block
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		
	}
}
