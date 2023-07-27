import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.io.Files;
import com.relevantcodes.extentreports.ExtentReports;
//import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

//import com.ro.qa.utility.TestUtil;

public class RODMT {
   public	WebDriver driver;
   public ExtentReports extent;
   public ExtentTest extentTest;
   
   @BeforeTest
   public void setExtent()
   {
	   extent= new ExtentReports(System.getProperty("user.dir")+"//test-output//ExtentReport.html",true);
	   extent.addSystemInfo("Host Name", "Preeti Jaiswal-BS0452");
	   extent.addSystemInfo("User Name", "Preeti Jaiswal");
	   extent.addSystemInfo("Enviroment", "preprod");
	   
   }
   
   @AfterTest
   public void endReport()
   {
	   extent.flush();
	   extent.close();
   }
   
   
   public static String getScreenShot(WebDriver driver, String ScreenshotName) throws IOException
   {
	   String dateName=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
	   File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   
	   String destination=System.getProperty("user.dir")+"//FailTestScreenShot//"+ScreenshotName+dateName+".png";
  File finalDestination=new File(destination);
FileUtils.copyFile(source,finalDestination);
return destination;
   
   }
	
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bs0452\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver= new ChromeDriver();
		 driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			driver.get("https://preprod.bankit.in/RO/");
	}
	
	@Test(priority=1)
	public void validate()
	{
		extentTest=extent.startTest("validate");
		String title=driver.getTitle();
		System.out.println("Title of page is======"+title);
		Assert.assertEquals(title, "BANKIT SERVICES PRIVATE LIMITED123@");
	}
	
	@Test(priority=2)
	public void logoVerify()
	{
		driver.switchTo().frame("Main");
		boolean b=driver.findElement(By.xpath("//img[@data-rjs='2']")).isDisplayed();
		Assert.assertFalse(b);
		
	}
	
	@AfterMethod
	public void teardown(ITestResult result) throws IOException
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			extentTest.log(LogStatus.FAIL, "Fail Test Case"+  result.getName());
			System.out.println(result.getName());
			extentTest.log(LogStatus.FAIL, "Fail Test Case"+  result.getThrowable());
			String screenShotPath=RODMT.getScreenShot(driver,  result.getName());
			
			extentTest.log(LogStatus.FAIL, extentTest.addScreenCapture(screenShotPath));
			}
		
		else if(result.getStatus()==ITestResult.SKIP)
		{
			extentTest.log(LogStatus.SKIP, "Fail Test Case"+  result.getName());
			extentTest.log(LogStatus.SKIP, "Fail Test Case"+  result.getThrowable());
		}
		
		else if(result.getStatus()==ITestResult.SUCCESS)
		{
			extentTest.log(LogStatus.PASS, "Pass Test Case"+  result.getName());
		}
		extent.endTest(extentTest);
		driver.quit();
	}

}
