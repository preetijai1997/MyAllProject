package com.ro.qa.testutility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.apache.commons.io.FileUtils;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;

import com.ro.qa.baseclass.TestBase;

public class TestUtility  extends TestBase{
	
	
	public static String TESTDATA_PATH="C:\\Users\\bs0452\\eclipse-workspace\\POMFrameWork\\src\\main\\java\\com\\ro\\qa\\testdata\\INITIATE TRANSACTION.xlsx";
	static Workbook book;
	static org.apache.poi.ss.usermodel.Sheet sheet;
	
	public TestUtility() throws IOException {
		super();
		
	}

	public static long PAGE_LOAD_TIMEOUT=40;
	public static long IMPLICIT_WAIT=30;
	
	public void swtichToFrame()
	{
	  driver.switchTo().frame("Main");
	}
	public static Object[][] getTestData(String sheetName) throws  IOException	
	{
		FileInputStream file=null;
		try {
			file=new FileInputStream(TESTDATA_PATH);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		try {
			book=WorkbookFactory.create(file);
		}
		catch(InvalidFormatException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		sheet=book.getSheet(sheetName);
		Object[][] data= new Object[((org.apache.poi.ss.usermodel.Sheet) sheet).getLastRowNum()][((org.apache.poi.ss.usermodel.Sheet) sheet).getRow(0).getLastCellNum()];
		for(int i=0; i<((org.apache.poi.ss.usermodel.Sheet) sheet).getLastRowNum();i++)
		{
			for(int k=0;k<((org.apache.poi.ss.usermodel.Sheet) sheet).getRow(0).getLastCellNum();k++)
			{
				data[i][k]=((org.apache.poi.ss.usermodel.Sheet) sheet).getRow(i+1).getCell(k).toString();
			}
		}
		return data;
		
	}
	
	public static void takeScreenShotAtEndOfTest() throws IOException
	{
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String currDir=System.getProperty("C:\\Users\\bs0452\\eclipse-workspace\\POMFrameWork\\Screenshot");
		FileUtils.copyFile(srcFile, new File(currDir+System.currentTimeMillis()+".png"));
		
	}
	
}
