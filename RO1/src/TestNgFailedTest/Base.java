package TestNgFailedTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public static WebDriver driver;
	
	
	public static void initialization()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bs0452\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}

	
	public void Failed(String testMethodName)
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyDirectory(src, new File("C:\\Users\\bs0452\\eclipse-workspace\\RO1\\ScreenShotTest\\"+ testMethodName+ "_"+".png"));
		} 
		catch (IOException e) {
		   e.printStackTrace();
		}
	}
}
