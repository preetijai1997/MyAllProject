import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import javaprogram.util.Properties;
import javaprogram.util.concurrent.TimeUnit;



public class ClassTest {
	public static EventFiringWebDriver e_driver;

public static WebDriver driver;
public static Properties prop;
	public ClassTest() throws IOException
	{
		prop=new Properties();
		
		FileInputStream fis=new FileInputStream("C:\\Users\\bs0452\\eclipse-workspace\\Test\\src\\main\\java\\config.properties");
	    prop.load(fis);
	
	}
	
	public static void initialization() throws IOException
	
	{
	
		String browserName=prop.getProperty("browser");
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\bs0452\\Downloads\\chromedriver_win32\\chromedriver.exe");
			 driver= new ChromeDriver();
			System.out.println("driver=="+driver);
			
			driver.manage().window().maximize();
			//driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
		//	driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
			driver.get(prop.getProperty("url"));
		}
	}

}
