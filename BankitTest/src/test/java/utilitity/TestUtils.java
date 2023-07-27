package utilitity;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import base.TestBase;


public class TestUtils  extends TestBase{
	
	public static String screenShotPath;
	public static String screenShotName;
	
public static FileInputStream file;
	
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	public static void captureScreenshot() throws IOException
	{
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Date d= new Date();
		screenShotName=d.toString().replace(":", "_").replace(" ", "_")+".png";
		FileUtils.copyFile(srcFile, new File(System.getProperty("user.dir")+"\\target\\surefire-reports\\html\\"+screenShotName));
		
	}
	
	public boolean isTestRunnable(String testname, ExcelReader excel) throws IOException
	{
		file= new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\excel\\RentPaymentExcel.xlsx");
		workbook= new XSSFWorkbook(file);
		String sheetName="TestRun";
		sheet=workbook.getSheet(sheetName);
		int rows=sheet.getLastRowNum();
		
		for(int rowNum=1; rowNum<rows; rowNum++)
		{
			String testCase=excel.getCellData(sheetName, 0, rowNum);
		}
		
		return false;
		
	
		
	}

}
