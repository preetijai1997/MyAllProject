import java.io.IOException;

import org.apache.commons.math3.util.MultidimensionalCounter.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataDrivenTest {

	private static char[] column;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
	String path=System.getProperty("user.dir");
	XSSFWorkbook workbook=new XSSFWorkbook(path+"\\Excel\\Test.xlsx");
	
	int sheets=workbook.getNumberOfSheets();
	for(int i=0;i<sheets;i++)
	{
		if(workbook.getSheetName(i).equalsIgnoreCase("sheet1"))
		{
			XSSFSheet sheet=workbook.getSheetAt(i);
			java.util.Iterator<Row> row=sheet.iterator();
		Row firstsheet=	row.next();
		java.util.Iterator<Cell> ce=firstsheet.cellIterator();
		int k=0;
		int column=0;
		while(ce.hasNext())
		{
			Cell value=ce.next();
			if(value.getStringCellValue().equalsIgnoreCase("PinCode"))
			{
				column=k;
			}
		}
		k++;
		}
		
		System.out.println(column);
	}

	}

}
