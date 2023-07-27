package DMT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class microATM {
public static WebDriver driver;

public static void main(String[] args) throws InterruptedException
{
	dologin();
	mATM();
}
	public static void dologin() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bs0452\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://uat.bankit.in/RO/");
		driver.manage().window().maximize();
		driver.switchTo().frame("Main");
		        //UserName
				WebElement username1=driver.findElement(By.name("userName"));
			    username1.clear();
			    username1.sendKeys("shobhit.rai@bankit.in");
			    
			    //Password
			    WebElement password1=driver.findElement(By.id("password"));
			    password1.clear();
			    password1.sendKeys("Amit@123");
			    
				//Login
			    WebElement loginbtnClick=  driver.findElement(By.id("login"));
			    loginbtnClick.click();
			  
			    //Popup Banner
			    Thread.sleep(2000);
			     driver.findElement(By.xpath("//*[@id=\"popup\"]/div/div/button/span")).click();
			  }
	
	public static void mATM()
	{
	WebElement uti=	driver.findElement(By.linkText("UTILITY"));
	uti.click();
	}

}
