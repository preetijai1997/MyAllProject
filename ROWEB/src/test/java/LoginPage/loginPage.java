package LoginPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginPage {
	
	public static WebDriver driver;
	public static void main(String[] args) {
		
		
		
	//	lp.logoClick();
	    userName("shobhit.rai@bankit.in");
	    password("Amit@123");
	}
	
	/*
	public void logoClick()
	{
		
	
		WebElement logoClick=driver.findElement(By.xpath("/html/body/div/header/div/div/div/a/img"));
		logoClick.click();
	}
	*/
	public static  WebElement userName(String username)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bs0452\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://uat.bankit.in/RO/");
		driver.switchTo().frame("Main");
		WebElement username1=driver.findElement(By.name("userName"));
	    username1.clear();
	    return username1;
	    
	}
	 public static  WebElement password(String password)
	 {
	    WebElement password1=driver.findElement(By.id("password"));
	    password1.clear();
	    return password1;
	    
	}

}
