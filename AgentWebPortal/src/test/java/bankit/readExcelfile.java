package bankit;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Formatter;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class readExcelfile {

	public static void main(String[] args) throws Exception {
	
		
		File src= new File("C:\\Users\\bs0452\\Documents\\ExcelSheet\\ExcelTestData.xlsx");
		
		FileInputStream fis= new FileInputStream(src);
		
		XSSFWorkbook workbook= new XSSFWorkbook(fis);
		
		XSSFSheet sheet= workbook.getSheetAt(0);
	int rowCount=sheet.getLastRowNum();
	System.out.println(rowCount+1);
	Formatter fmt = new Formatter();  
	for(int i=0; i<rowCount;i++)
	{
		Row row= sheet.getRow(i);
	//	System.out.println(row);
		for(int j=0;j<row.getLastCellNum();j++)
		{
		
			 System.out.format("%7s", sheet.getRow(i).getCell(j)+" ");
			// System.out.println();  
		}
		System.out.println();
	}
		
//	String cellvalue=	sheet.getRow(0).getCell(0).getStringCellValue();
//	System.out.println(cellvalue);

	}

	private static int getCell(int j) {
		// TODO Auto-generated method stub
		return 0;
	}

}
