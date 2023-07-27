package com.ro.qa.baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.ro.qa.utility.TestUtil;
import com.ro.qa.utility.WebEventListener;

public class TestBase {
	public static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;
public static WebDriver driver;
public static Properties prop;
	public TestBase() throws IOException
	{
		prop=new Properties();
		
		FileInputStream fis=new FileInputStream("C:\\Users\\bs0452\\eclipse-workspace\\POMFrameWork\\src\\main\\java\\com\\ro\\qa\\config\\config.properties");
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
			e_driver=new EventFiringWebDriver(driver);
			eventListener=new WebEventListener();
			e_driver.register(eventListener);
			driver=e_driver;
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
			driver.get(prop.getProperty("url"));
		}
	}

}
