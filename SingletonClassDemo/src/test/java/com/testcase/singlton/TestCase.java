package com.testcase.singlton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.test.singleton.Constant;
import com.test.singleton.Singleton;

public class TestCase {
	static WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		Singleton.initialize();
	}
	
	@Test(priority=1)
	public void loginTest()
	{
		Singleton.driver.switchTo().frame("Main");
		Singleton.driver.findElement(By.name("loginId")).sendKeys(Constant.userName);
		Singleton.driver.findElement(By.id("password")).sendKeys(Constant.password);
		
		Singleton.driver.findElement(By.linkText("Log In")).click();
	}
	
	@Test(priority=2)
	public void verifyTitle()
	{
	String title=	Singleton.driver.getTitle();
	System.out.println(title);
	Assert.assertEquals(title, Constant.title);
	}
	
	
	@AfterMethod
	public void TearDown()
	{
		Singleton.quit();
	}

}
