import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CAPSLogin {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bs0452\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://uat.bankit.in/CAPS/");
		driver.manage().window().maximize();
		driver.switchTo().frame("Main");
	
	  WebElement option= driver.findElement(By.name("userType"));
	  Select se=new Select(option);
	  se.selectByVisibleText("Other User");
	  Thread.sleep(3000);
	 
	  
	 WebElement uname= driver.findElement(By.name("userName"));
	 uname.clear();
	 uname.sendKeys("vaibhav.gupta@bankit.in");
	  
	WebElement pass= driver.findElement(By.id("password"));
	pass.clear();
	pass.sendKeys("6094107e");
	
	WebElement click= driver.findElement(By.id("login_btn"));
	click.click();

	}

}
