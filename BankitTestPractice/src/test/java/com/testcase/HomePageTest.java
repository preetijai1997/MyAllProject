package com.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.actionsdriver.Action;
import com.base.Base;
import com.pageobjects.HomePage;
import com.pageobjects.LoginPage;

public class HomePageTest extends Base{
	
	HomePage hp;
	LoginPage lp;
	@BeforeMethod
	public void setUp()
	{
	launchBrowser();
	driver.get(prop.getProperty("url"));
	Action.fullScreen(driver);
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	

	
	@Test(priority=1)
	public void crossPopup() throws InterruptedException
	{
		 lp= new LoginPage(driver);
		 
		 lp.signIn(); 
		hp= new HomePage();
		hp.crossPopUp();
	}
	
	@Test(priority=2)
	public void clickDMT() throws InterruptedException
	{
 lp= new LoginPage(driver);
		 
		 lp.signIn(); 
		 hp= new HomePage();
		 hp.crossPopUp();
		hp.clickOnDMT();
	}
	
	@Test(priority=3)
	public void aremit() throws InterruptedException
	{
 lp= new LoginPage(driver);
		 
		 lp.signIn();
		 hp= new HomePage();
		 hp.crossPopUp();
		 hp.clickOnDMT();
		hp.clickOnAremit();
	}
	
	
	
	

}
