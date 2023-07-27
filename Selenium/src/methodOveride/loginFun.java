package methodOveride;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginFun {
public static WebDriver driver;
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bs0452\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://uat.bankit.in/RO/");
		driver.manage().window().maximize();
		driver.switchTo().frame("Main");
	}
	
	public void Login(String u, String p)
	{
		WebElement userName=driver.findElement(By.name("userName"));
		userName.sendKeys("shobhit.rai@bankit.in");

		
		WebElement pass=driver.findElement(By.id("password"));
		pass.sendKeys("Amit@123");
	}
	
	public void click()
	{
		WebElement clickLogin=	driver.findElement(By.id("login"));
		clickLogin.click();
	}
}
