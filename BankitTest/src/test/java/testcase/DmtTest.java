package testcase;

import java.util.List;

import org.apache.commons.math3.stat.inference.TestUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import base.TestBase;
import utilitity.ExcelReader;

public class DmtTest extends TestBase {
	
	
	
	@Test(priority=2)
	public void AremitSenderRegistration() throws InterruptedException
	{
       
		Thread.sleep(3000);
		//driver.findElement(By.xpath(OR.getProperty("DMTLink"))).click();
		click("DMTLink_XPATH");
		List<WebElement> dmtDropDown=driver.findElements(By.xpath(OR.getProperty("DMTDropdowns")));
		System.out.println("----------------------------");
		for(int i=0; i<dmtDropDown.size();i++)
		{
			
			//System.out.println(dmtDropDown.get(i).getText());
			
			dmtDropDown.get(i).click();
			if(dmtDropDown.get(i).getText().equals("AremitLink"))
			{
				
				String option=dmtDropDown.get(i).getText();
				System.out.println("Option is : "+ option);
				dmtDropDown.get(i).click();
				System.out.println("click on dmt option");
				
			}
		}
		
		//Reporter.log("<a href='C:\\Users\\bs0452\\Pictures\\1.png'> Screenshot</a>");
		
		
	}
	/*
	@DataProvider
	public Object[][] getData()
	{
		String sheetName="DmtTest";
		int rows=excel.getRowCount(sheetName);
		int cols= excel.getColumnCount(sheetName);
		
		Object[][] data= new Object[rows-1][cols];
		
		for(int rowNum=2; rowNum<rows;rowNum++)
		{
			for(int colNum=0;colNum<cols;colNum++)
			{
			data [rowNum-2][colNum]= excel.getCellData(sheetName,colNum,rowNum);
		}
		}
		return data;
		}
	*/	
		
	}


