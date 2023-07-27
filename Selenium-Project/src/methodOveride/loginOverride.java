package methodOveride;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.apache.log4j.Logger;



public class loginOverride extends loginFun {
	
	private static Logger log=Logger.getLogger(loginOverride.class);
public static WebDriver driver;
	public static void main(String[] args) {
		log.info("------------------------------Executing main()------------------------------");
		System.out.println("Executing main");
		loginOverride lo=new loginOverride();
		lo.setup();
		lo.Login("aditya.upadhyay@bankit.in","xlopy039");
		lo.click();

	}
	public void Login(String u, String p)
	{
		WebElement userName=driver.findElement(By.name("userName"));
		userName.sendKeys("aditya.upadhyay@bankit.in");

		
		WebElement pass=driver.findElement(By.id("password"));
		pass.sendKeys("xlopy039");
	}

}
