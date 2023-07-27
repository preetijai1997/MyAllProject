package com.test.singleton;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Singleton {
	
	public static WebDriver driver=null;
	

	public static void initialize()
	{
		if(driver==null)
		{
			if(Constant.browser.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\bs0452\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
				 driver= new ChromeDriver();
				 
			}
				 driver.manage().timeouts().implicitlyWait(4000,TimeUnit.SECONDS);
				 driver.manage().window().maximize();
				 driver.get(Constant.url);
				 
			}
		}
		
		public static void quit()
		{
			driver.quit();
			driver=null;
		}
		
		
		public static void close()
		{
			driver.close();
			driver=null;
		
		
	}

}
