package writeexcelfile;

import java.io.*;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;



public class WriteExcelFile {

	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook workbook= new XSSFWorkbook();
		
		XSSFSheet sheet= workbook.createSheet("DMT");
		
		for(int rows=0; rows<8;rows++)
		{
			Row row= sheet.createRow(rows);
			
			for(int cols=0; cols<9;cols++)
			{
				Cell col= row.createCell(cols);
				col.setCellValue("Preeti Jaiswal");			
				}
		}
		
		//Connectivity stream
		
		File f= new File("C:\\Users\\bs0452\\Documents\\WriteFile\\text.xlsx");
		
		
		FileOutputStream fo= new FileOutputStream(f);
		workbook.write(fo);
		
		System.out.println("File Created...");
		
		
		
	}

}
