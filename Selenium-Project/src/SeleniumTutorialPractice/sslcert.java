package SeleniumTutorialPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sslcert {
	
public static String browser="edge";
public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bs0452\\Downloads\\chromedriver_win32\\chromedriver.exe");
		DesiredCapabilities ds=new DesiredCapabilities();
		ds.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ds.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
	//	ds.setAcceptInsecureCerts(true);
		
		ChromeOptions coptions=new ChromeOptions();
		coptions.merge(ds);

		
		WebDriver driver=new ChromeDriver(coptions);
		driver.get("https://expired.badssl.com/");
		*/
		DesiredCapabilities ds=new DesiredCapabilities();
		
		if(browser.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bs0452\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ds.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ds.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ChromeOptions coptions=new ChromeOptions();
		coptions.merge(ds);

		
		WebDriver driver=new ChromeDriver(coptions);
		
		
		}
		else if(browser.equals("edge"))
		{
			
			ds.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
			ds.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
			EdgeOptions eoptions=new EdgeOptions();
			eoptions.merge(ds);

			
			WebDriver driver=new EdgeDriver(eoptions);
			
		}
		driver.get("https://expired.badssl.com/");
	}

}
