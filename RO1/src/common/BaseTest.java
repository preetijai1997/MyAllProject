package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
	public static WebDriver driver;
	@BeforeSuite
	public void launchTest()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bs0452\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
	}
	
	@AfterSuite
	public void logoutTest()
	{
		driver.close();
	}

}
