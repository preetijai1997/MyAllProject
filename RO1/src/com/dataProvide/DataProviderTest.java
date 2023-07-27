package com.dataProvide;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	WebDriver driver;
	@BeforeMethod()
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bs0452\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://signup.ebay.com/pa/crte?ru=https%3A%2F%2Fwww.ebay.com%2Fn%2Ferror");
		
	}
	@DataProvider
	public void getData()
	{
		
	}
	
	@Test
	public void HalfEbayTest(String firstname,String lastname,String  Email, String  password )
	{
		
		//First Name
		driver.findElement(By.id("firstname")).clear();
		driver.findElement(By.id("firstname")).sendKeys(firstname);
		
		//Last Name
		driver.findElement(By.id("lastname")).clear();
		driver.findElement(By.id("lastname")).sendKeys(lastname);
		
		//Email Id
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys(Email);
		
		//Password
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys(password);
		
		//Showpassword
		driver.findElement(By.id("showpassword")).click();
		
		
	}
	
	@AfterMethod()
	public void tearDown()
	{
		driver.quit();
	}
}
