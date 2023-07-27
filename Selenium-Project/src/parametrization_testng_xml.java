import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class parametrization_testng_xml {
	
	public static WebDriver driver;
	
	@Test
	@Parameters({"URL","emailid","password"})
	public void geturl( String URL, String emailid, String password)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bs0452\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);//url
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.className("signin")).click();//click on signin
		driver.findElement(By.name("login")).sendKeys(emailid);//email
		driver.findElement(By.name("passwd")).sendKeys(password);//password
		//driver.findElement(By.name("proceed")).click();
		driver.findElement(By.linkText("Forgot Password?")).click();
	}
	
	
		
	

}
