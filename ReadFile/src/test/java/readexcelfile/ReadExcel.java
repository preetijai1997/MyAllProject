package readexcelfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		File f= new File("C:\\Users\\bs0452\\Documents\\WriteFile\\text.xlsx");
		
		FileInputStream fi= new FileInputStream(f);
		
		Workbook workbook= WorkbookFactory.create(fi);
		
		Sheet sheet0= workbook.getSheetAt(0);
		int count=0;
		for(Row row:sheet0)
		{
			for(Cell cell: row)
			{
				//System.out.println("Cell Type "+cell.getCellType()+ " Value " + row.getCell(count));
				//System.out.println(Cell.CELL_TYPE_BLANK);
				switch(cell.getCellType())
				{
				case STRING:
					System.out.print(cell.getStringCellValue() +"\t "+ "String TYPE PRINT");
					
					break;
					
				case BLANK:
					System.out.print("It is blank value");
					break;
				case NUMERIC:
					System.out.print(cell.getNumericCellValue()+"\t "+" Numberic value");
										break;
				}
				
				
				count++;
			}
			System.out.println( );
			
		}
		System.out.println("Total count is : "+ count);
		
	}
	
	

}
