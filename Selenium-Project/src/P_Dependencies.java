import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class P_Dependencies {

	public static WebDriver driver;
	
	@BeforeTest
	public void start()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bs0452\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mycarhelpline.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	
	}
	@Test
	public void First()
	{
		System.out.println(driver.getCurrentUrl());
		
	}
}
