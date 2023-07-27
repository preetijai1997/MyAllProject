package SeleniumTutorialPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//import com.beust.jcommander.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTestRO {

	public static WebDriver driver;
	
	@Parameters({"browser"})
	@Test
	public void LaunchTest(String browser)
	{
		if(browser.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			 driver= new ChromeDriver();
		}
		else if(browser.equals("edge"))
		{
			 WebDriverManager.edgedriver().setup();
			 driver= new EdgeDriver();
			}
		driver.get("https://uat.bankit.in/RO/");
		driver.switchTo().frame("Main");
		driver.findElement(By.name("userName")).sendKeys("shobhit.rai@bankit.in");
		driver.findElement(By.id("password")).sendKeys("Amit@123");
		driver.findElement(By.id("login")).click();

	}

	}

