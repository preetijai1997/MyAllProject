import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.record.MyScreenRecorder;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyTestDemo {
	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	
	@Test
	public void browserRecord() throws Exception
	{
		MyScreenRecorder.startRecording("browserRecord");
		driver.get("https://www.google.com/");
		driver.navigate().to("https://uat.bankit.in/RO/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().forward();
		MyScreenRecorder.stopRecording();
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
