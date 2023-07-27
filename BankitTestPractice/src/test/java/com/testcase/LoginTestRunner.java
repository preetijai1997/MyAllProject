package com.testcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.actionsdriver.Action;
import com.base.Base;
import com.pageobjects.LoginPage;

public class LoginTestRunner extends Base {

	LoginPage lp=new LoginPage(driver);
		//@BeforeMethod
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
		
		
		@Test
		public void checkLogo()
		{
			 lp= new LoginPage(driver);
			boolean isLogoPresent=lp.checkLogo();
			Assert.assertTrue(isLogoPresent);
			
		}
		
		@Test
		public void login() throws InterruptedException
		{
			 lp= new LoginPage(driver);
			 
				 lp.signIn(); 
			 }
			
		
		
		
		//LoginPage
		
		
//		//HomePage
//		HomePage hp=new HomePage();
//		hp.crossPopUp();
//		hp.clickOnDMT();
//		hp.clickOnAremit();
//		
//		//Aremit
//		Aremit ar= new Aremit();
//		ar.SenderRegistration();
		

	}


