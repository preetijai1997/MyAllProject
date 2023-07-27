package com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FBTest {
	WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser() 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bs0452\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");

		}
	
	@Test
	public void FbTitle()
	{
		String title=driver.getTitle();
		Assert.assertEquals(title, "Facebook – log in or sign up", "Pass Test");
	}
	
	

}
