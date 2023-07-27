import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Depends_Method {
	public static WebDriver driver;
	
@BeforeTest

public void start()
{
	WebDriverManager.chromedriver().setup();

	
 driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.mycarhelpline.com/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

}
@Test
public void First()
{
	//WebDriver driver = new ChromeDriver();
	System.out.println(driver.getCurrentUrl());
	String CurrentURL="https://www.mycarhelpline.com/";
	
	if(CurrentURL.equals("https://www.mycarhelpline.com/"))
	{
		System.out.println("Test Case is Pass");
	}
	else
	{
		System.out.println();
	}
}
@Test
public void Second()
{
	
	System.out.println(driver.getCurrentUrl());
	driver.findElement(By.linkText("Calculator")).click();
}
@Test
public void Third()
{
	
	driver.findElement(By.linkText("Home")).click();
}
}
