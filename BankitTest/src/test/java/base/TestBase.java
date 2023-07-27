package base;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import utilitity.ExtentManager;
import utilitity.TestUtils;






public class TestBase {
	
	
	public static WebDriver driver;
	public static Properties config= new Properties();
	public static Properties OR= new Properties();
	public static FileInputStream fis;
	public static Logger log= Logger.getLogger("devpinoyLogger");
	public ExtentReports reo=ExtentManager.getInstance();
	public static ExtentTest test;
	
	
	@BeforeSuite
	public void setUp() 
	{
		if(driver==null)
		{
			
			try {
				fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\config.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				
				config.load(fis);
				log.debug("Config file is loaded");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\OR.properties");
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			}
			
			try {
				
				OR.load(fis);
				log.debug("OR file is loaded");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
			if(config.getProperty("browser").equals("chrome"))
				
			{
				ChromeOptions option= new ChromeOptions();
				option.addArguments("--remote-allow-origins=*");
				
				System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\executables\\chromedriver.exe");
				driver= new ChromeDriver(option);
				log.debug("ChromeDriver is initialize");
				
			}
			else if(config.getProperty("browser").equals("firefox"))
			{
				System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\executables\\geckodriver.exe");
				
				driver= new FirefoxDriver();
				log.debug("Firefox Driver is initialize");
			}
		
			
			driver.get(config.getProperty("url"));
			log.debug("Open the URL");
			driver.manage().window().maximize();
			
			
			driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("implicit_wait")),TimeUnit.SECONDS);
			
			
		}
	}
	
	public void click(String locator)
	{
		if(locator.endsWith("_XPATH"))
		{
		driver.findElement(By.xpath(OR.getProperty(locator))).click();
		}
		else if(locator.endsWith("_NAME"))
		{
		driver.findElement(By.name(OR.getProperty(locator))).click();
		}
		else if(locator.endsWith("_ID"))
		{
		driver.findElement(By.id(OR.getProperty(locator))).click();
		}
		test.log(LogStatus.INFO, "clicking on "+ locator);
	}
	
	public void type(String locator, String value)
	{
		if(locator.endsWith("_XPATH"))
		{
		driver.findElement(By.xpath(OR.getProperty(locator))).sendKeys(config.getProperty(value));
		}
		else if(locator.endsWith("_ID"))
		{
		driver.findElement(By.id(OR.getProperty(locator))).sendKeys(config.getProperty(value));
		}
		else if(locator.endsWith("_NAME"))
		{
		driver.findElement(By.name(OR.getProperty(locator))).sendKeys(config.getProperty(value));
		}
		test.log(LogStatus.INFO, "Typing in "+ locator +" value is "+ config.getProperty(value));
	}
	public static boolean elementPresent(WebDriver driver,String path) 
	{
		try
		{
			driver.findElement(By.xpath(path));
		}
		catch (NoSuchElementException e)
		{
			return false;
		}
		
		
		return true;
	}
	
	public static void verify(String actual, String expected) throws IOException
	{
		try
		{
			Assert.assertEquals(actual, expected);
		}
		catch(Throwable T)
		{
			TestUtils.captureScreenshot();
			//Reportng
			Reporter.log("<br>"+ "Verification Failure "+ T.getMessage());
			Reporter.log("<a  target=\"_blank\" href="+TestUtils.screenShotName+"> <img src="+TestUtils.screenShotName+" height=200 width=300> </img></a>");	
			Reporter.log("<br>");
			Reporter.log("<br>");
			//Extent  Report
			test.log(LogStatus.FAIL, "Verification failed with exception "+ T.getCause());
			
	        		
		}
	}
	
	 static WebElement dropdown;
	public void select(String locator, String value)
	{
		if(locator.endsWith("_XPATH"))
		{
			dropdown=driver.findElement(By.xpath(OR.getProperty(locator)));
		}
		else if(locator.endsWith("_NAME"))
		{
			dropdown=driver.findElement(By.name(OR.getProperty(locator)));
		}
		else if(locator.endsWith("_ID"))
		{
			dropdown=driver.findElement(By.id(OR.getProperty(locator)));
		}
		Select s= new Select(dropdown);
	    s.selectByValue(value);

		
		test.log(LogStatus.INFO, "Selecting from dropdown "+ locator + "value as "+ value);
		}
	
	@AfterSuite
	public void tearDown()
	{
		if(driver !=null)
		{
			//driver.quit();
		}
		log.debug("Quit the site");
	}
	
}
