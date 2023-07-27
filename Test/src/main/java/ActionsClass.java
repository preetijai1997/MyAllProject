import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import javaprogram.util.Properties;

public class ActionsClass {
	public static WebDriver driver;
	public static Properties prop;
	public  ActionsClass() throws IOException
	{
		prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\bs0452\\eclipse-workspace\\Test\\src\\main\\java\\config.properties");
	    prop.load(fis);
	}
	public static void initialize() throws InterruptedException
	{
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bs0452\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get(prop.getProperty("url"));
		 driver.switchTo().frame("Main");
		 Thread.sleep(3000);
		 driver.findElement(By.name("userName")).sendKeys(prop.getProperty("username"));
		 driver.findElement(By.id("password")).sendKeys(prop.getProperty("password"));
		 driver.findElement(By.id("login")).click();
	}
	
	

}
