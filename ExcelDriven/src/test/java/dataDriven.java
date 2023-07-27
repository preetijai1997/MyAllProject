import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataDriven {

	public static void main(String[] args) throws IOException {
		
		
		FileInputStream fis=new FileInputStream("C:\\Users\\bs0452\\Documents\\TestingPurpose.xlsx");
		XSSFWorkbook excel=new XSSFWorkbook(fis);
		
	int Sheets=	excel.getNumberOfSheets();
	for(int i=0;i<Sheets;i++)
	{
		if(excel.getSheetName(i).equalsIgnoreCase("TestData"))
		{
			XSSFSheet sheet=excel.getSheetAt(i);
		     Iterator<Row> rows=sheet.iterator();
		    Row firstrow= rows.next();
		     
		     
		Iterator<Cell>cells= firstrow.cellIterator();
		while(cells.hasNext())
		{
			Cell value=cells.next();
			if(value.getStringCellValue().equalsIgnoreCase("Data1"))
			{
				
			}
		}
			
			
	
		}
	}
	}

}
