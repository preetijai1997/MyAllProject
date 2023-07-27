package com.google.multithread;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BasePage {

	
	public static WebDriver driver;
	
	public static  WebDriver setup(String browserName)
	{
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\bs0452\\Downloads\\chromedriver_win32\\chromedriver.exe");
			 driver= new ChromeDriver();
			
		}
		
		
		else if(browserName.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.edge.driver", "C:\\Users\\bs0452\\Downloads\\edgedriver_win64\\msedgedriver.exe");
			WebDriver driver= new EdgeDriver();
		}
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		return driver;
		
		
	}
	
}
