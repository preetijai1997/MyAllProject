package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;



import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public static Properties prop;
	
	public static WebDriver driver;
	public static FileInputStream fis ;
	
	@BeforeTest
	public static void logConfig() throws IOException
	{
		
		try {
			prop= new Properties();
			 fis = new FileInputStream(System.getProperty("user.dir")+"\\Configruation\\Config.properties");
			 
			prop.load(fis);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}
	
	
	
	public static void launchBrowser()
	{
		WebDriverManager.chromedriver().setup();
		
		String browserName= prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("Chrome"))
		{
			driver=new ChromeDriver();
			
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			driver= new FirefoxDriver();
		}
		
		 
	}
	
//	private static ThreadLocal<WebDriver> tldriver = new ThreadLocal<WebDriver>();
//
//    
//
//    public synchronized static WebDriver getDriver() {
//
//                return tldriver.get();
//
//    }
	

}
