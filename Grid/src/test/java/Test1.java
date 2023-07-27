//import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test1 {
	
	@Parameters({"browser"})
	@Test
	public void testLogin(String browser) throws MalformedURLException
	{
	
		
		ChromeOptions option=null;
		
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\bs0452\\Downloads\\browsers\\chromedriver_win32\\chromedriver.exe");
			 option=new ChromeOptions();
		 option.addArguments("--remote-allow-origins=*");
		 option.setCapability(CapabilityType.BROWSER_NAME, "chrome");
		}
		/*
		else if(browser.equals("firefox"))
		{
			
			System.setProperty("webdriver.firefox.driver","C:\\Program Files\\Mozilla Firefox\\firefox.exe");
//			File pathToBinary = new File("C:\\Program Files\\Mozilla Firefox15\\Firefox.exe");
//			FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
//			FirefoxProfile firefoxProfile = new FirefoxProfile();
			
		
			
			option=new ChromeOptions();
			 option.addArguments("--remote-allow-origins=*");
			 option.setCapability(CapabilityType.BROWSER_NAME, "firefox");
		}
		/*
		else if(browser.equals("microsoftedge"))
		{
			System.setProperty("webdriver.edge.driver","C:\\Users\\bs0452\\Downloads\\edgedriver_win64\\msedgedriver.exe");
			option=new ChromeOptions();
			 option.addArguments("--remote-allow-origins=*");
			 option.setCapability(CapabilityType.BROWSER_NAME, "microsoftedge");
		}
		*/
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),option);
		//WebDriver driver = RemoteWebDriver.builder().oneOf(option).address("https://localhost:4444/wd/hub").build();
		driver.get("https://uat.bankit.in/RO/");
		driver.manage().window().maximize();
		driver.quit();
		
	}

}
