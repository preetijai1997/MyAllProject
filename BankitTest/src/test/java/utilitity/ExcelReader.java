package utilitity;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import base.TestBase;



public class ExcelReader  extends TestBase{
	
	public static FileInputStream file;
	
	public static XSSFWorkbook workbook;
	
	

	public static XSSFSheet firstSheet;
	public static XSSFSheet secondSheet;
	public static XSSFSheet thirdSheet;
	public static XSSFSheet testSheet;
	public XSSFRow row   =null;
	public XSSFCell cell = null;
	
    @Test
	public void ExcelReadeing() throws IOException, InterruptedException
	{
		
		file= new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\excel\\Test.xlsx");
		workbook= new XSSFWorkbook(file);
		firstSheet= workbook.getSheet("Sheet1");
		secondSheet= workbook.getSheet("Sheet2");
		
		
			
		
		int rowCount=firstSheet.getLastRowNum()-firstSheet.getFirstRowNum();
		
		int cellCount=firstSheet.getRow(0).getLastCellNum();
		
		int rowCountSecondPage=secondSheet.getLastRowNum();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		
		for(int i=1; i<rowCount+1;i++)
		{
			XSSFRow currentRow=firstSheet.getRow(i);
			String mobile_number=currentRow.getCell(0).getStringCellValue();
			System.out.println("Mobile num is : "+ mobile_number);
			performNeccessaryAction(driver,"//input[@id=\"mobile_no\"]","xpath","sendkeys",mobile_number,false);
			//driver.findElement(By.id(OR.getProperty("senderNum"))).sendKeys(mobile_number);
			Thread.sleep(3000);
			performNeccessaryAction(driver,OR.getProperty("subBtn_XPATH"),"xpath","click","",false);
			
			if(elementPresent(driver,"//td[text()='Kyc Status :']"))
			{
				performNeccessaryAction(driver,OR.getProperty("cancelBtn_XPATH"),"xpath","click","",false);
				
			} 
			else 
			{
			
				XSSFRow currentRow1=secondSheet.getRow(i);
			
			
				String Sender_Name=currentRow1.getCell(0).getStringCellValue();
				System.out.println("name is  is : "+ Sender_Name);
				String Address=currentRow1.getCell(1).getStringCellValue();
				System.out.println("Address is : "+ Address);

			
				performNeccessaryAction(driver,"//input[@name='c_name']","xpath","sendkeys",Sender_Name,true);
				
				//driver.findElement(By.id(OR.getProperty("name"))).sendKeys(Sender_Name);
				performNeccessaryAction(driver,"//input[@name=\"c_address\"]","xpath","sendkeys",Address,true);
				
				//driver.findElement(By.id(OR.getProperty("address"))).sendKeys(Address);
				performNeccessaryAction(driver,"//input[@name='c_dob']","xpath","click","",true);
				//driver.findElement(By.id(OR.getProperty("dob"))).click();
				
				Select yearDropdown=new Select(driver.findElement(By.xpath(OR.getProperty("year_XPATH"))));
				String year= currentRow1.getCell(2).getStringCellValue();
				System.out.println("year is : "+ year);
				yearDropdown.selectByValue(year);
				
				
				Select monthDropdown=new Select(driver.findElement(By.xpath(OR.getProperty("month_XPATH"))));
				String month= currentRow1.getCell(3).getStringCellValue();
				System.out.println("month is "+ month);
				monthDropdown.selectByValue(month);
				
				performNeccessaryAction(driver,OR.getProperty("date_XPATH"),"xpath","click","",true);
				//driver.findElement(By.xpath(OR.getProperty("date"))).click();		
				performNeccessaryAction(driver,OR.getProperty("subBtn_XPATH"),"xpath","click","",true);
				//driver.findElement(By.xpath(OR.getProperty("subBtn"))).click();
				System.out.println("OTP is -------------");
				performNeccessaryAction(driver,OR.getProperty("OTP_ID"),"id","click","",true);
				//driver.findElement(By.id(OR.getProperty("OTP"))).click();
				Thread.sleep(35000);
				System.out.println("OTP------------");
				performNeccessaryAction(driver,OR.getProperty("subBtn_XPATH"),"xpath","click","",true);
				//driver.findElement(By.xpath(OR.getProperty("subBtn"))).click();
				}
			
		}
			
		}		
			
	
		@Test
		public void RentPayment() throws IOException, InterruptedException
		{
			file= new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\excel\\RentPaymentExcel.xlsx");
			workbook= new XSSFWorkbook(file);
			thirdSheet= workbook.getSheet("Sheet1");
			int rowCountThirdPage=thirdSheet.getLastRowNum();
			
			
			
			
			
			
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			
			
		for(int i=1; i<rowCountThirdPage+1;i++)
		{
			XSSFRow currentRow=thirdSheet.getRow(i);
			performNeccessaryAction(driver,OR.getProperty("RentPayment_XPATH"),"xpath","click","",false);
			String RentType=currentRow.getCell(0).getStringCellValue();
			System.out.println("RentType  is : "+ RentType);
			performNeccessaryAction(driver,OR.getProperty("RentType_XPATH"),"xpath","sendkeys",RentType,false);
			
			String ContactNo=currentRow.getCell(1).getStringCellValue();
			performNeccessaryAction(driver,OR.getProperty("ContactNum_ID"),"id","sendkeys",ContactNo,false);
			System.out.println("ContactNo is : "+ ContactNo);
			String holderName=currentRow.getCell(2).getStringCellValue();
			performNeccessaryAction(driver,OR.getProperty("HolderName_ID"),"id","sendkeys",holderName,false);
			System.out.println("Holder name is "+ holderName);
			String acno=currentRow.getCell(3).getStringCellValue();
			performNeccessaryAction(driver,OR.getProperty("AccountNum_ID"),"id","sendkeys",acno,false);
			System.out.println("Ac no  is "+ acno);
			String confirmacno=currentRow.getCell(4).getStringCellValue();
			performNeccessaryAction(driver,OR.getProperty("ConfirmAccountNo_ID"),"id","sendkeys",confirmacno,false);
			performNeccessaryAction(driver,OR.getProperty("BankNameClick_XPATH"),"xpath","click","",false);
			System.out.println("Confirm accountno is "+ confirmacno);
			/*String BankName=currentRow.getCell(5).getStringCellValue();
			System.out.println("Bank name is :" +BankName );
			Thread.sleep(7000);
//			new WebDriverWait(driver, 20).until(ExpectedConditions.elementto(OR.getProperty("BankName_XPATH")).click();
			performNeccessaryAction(driver,OR.getProperty("BankName_XPATH"),"xpath","sendkeys",BankName,false);
			*/
			List<WebElement> listOfBank= driver.findElements(By.xpath("//ul[@id=\"select2-bankname-results\"]/li"));
			
			for(int j=0; j<listOfBank.size();j++)
			{
				if(listOfBank.get(j).getText().equals("State Bank of India"))
				{
					listOfBank.get(j).click();
					break;
				}
					
			}

			performNeccessaryAction(driver,OR.getProperty("RegisterBtn_ID"),"id","click","",false);
			
			//driver.findElement(By.id(OR.getProperty("name"))).sendKeys(Sender_Name);
			
			
			
			
						
		}
				
		
		}

		//driver.findElement(By.xpath(OR.getProperty("subBtn"))).click();

		
		
	
	
	
	public static boolean elementPresent(WebDriver driver,String path,String type) 
	{
		try
		{
			if(type.equals("xpath"))
			{
				driver.findElement(By.xpath(path));
			}
			
			else if(type.equals("id"))
			{
				driver.findElement(By.id(path));
				
			}
			else if(type.equals("name"))
			{
				driver.findElement(By.name(path));
			}
					
		}
		catch (NoSuchElementException e)
		{
			return false;
		}
		
		
		return true;
	}
	
	public static void performNeccessaryAction(WebDriver driver, String path,String type, String action, String val,boolean isContinue)
	{
		boolean isPresent= elementPresent(driver,path,type);
		if(isPresent)
		{
		if(action.equals("click") )
		{
			if(type.equals("xpath"))
			{
			driver.findElement(By.xpath(path)).click();
			}
			else if(type.equals("id"))
			{
			driver.findElement(By.id(path)).click();
			}
			else if(type.equals("name"))
			{
			driver.findElement(By.name(path)).click();
		}
		}
		else if(action.equals("sendkeys"))
		{
			if(type.equals("xpath"))
			{
			driver.findElement(By.xpath(path)).sendKeys(val);
			}
			
			else if(type.equals("id"))
			{
			driver.findElement(By.id(path)).sendKeys(val);
			}
			else if(type.equals("name"))
			{
				driver.findElement(By.name(path)).sendKeys(val);
			}
			
		}
		
		
		
		else
		{
			System.out.println("Action can not be perform");
		}
		}
		else
		{
			System.out.println("element not present: " + path);
			if(!isContinue)
			{
				return;
			}
			
		}
	
	
	



	 public String getCellData(String sheetName,String colNum,int rowNum)
	    {
	        try
	        {
	        	testSheet = workbook.getSheet(sheetName);
	            row = testSheet.getRow(rowNum);
	            cell = row.getCell(colNum);
	            if(cell.getCellType() == CellType.STRING)
	                return cell.getStringCellValue();
	            else if(cell.getCellType() == CellType.NUMERIC || cell.getCellType() == CellType.FORMULA)
	            {
	                String cellValue  = String.valueOf(cell.getNumericCellValue());
	                
	            } if(cell.getCellType() == CellType.BLANK)
	                return "";
	            else
	                return String.valueOf(cell.getBooleanCellValue());
	        }
	        catch(Exception e)
	        {
	            e.printStackTrace();
	            return "row "+rowNum+" or column "+colNum +" does not exist  in Excel";
	        }
	        
	    }
	

