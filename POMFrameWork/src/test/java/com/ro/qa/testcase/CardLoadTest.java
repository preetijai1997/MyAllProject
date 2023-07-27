package com.ro.qa.testcase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ro.qa.baseclass.TestBase;
import com.ro.qa.page.CardLoadPage;
import com.ro.qa.page.CardPage;
import com.ro.qa.page.HomePage;
import com.ro.qa.page.LoginPage;
import com.ro.qa.utility.TestUtil;

public class CardLoadTest extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	TestUtil testutil;
	CardPage cardpage;
	
	
    CardLoadPage cardloadpage;
	public CardLoadTest() throws IOException {
		super();
		
	}
	
	@BeforeMethod()
	public void setUp() throws IOException
	{
		initialization();
		testutil=new TestUtil();
		loginpage=new LoginPage();
		
		testutil.swtichToFrame();
		homepage= loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		loginpage.cutPopup();
		//testutil.swtichToFrame();
		cardpage=new CardPage();
		cardpage=homepage.clickOnCardTest();
		
		cardloadpage=cardpage.CardloadPage();
		}
	
	@Test(priority=1)
	public void cardloadDetails()
	{
		cardloadpage.CardDetails(prop.getProperty("mobno"), prop.getProperty("Amount"));
       boolean message=cardloadpage.cardSuccessMessage();
		
		Assert.assertTrue(message);
		
	}
	
	
	/*
	@Test(priority=2)
	public void verifycardHolderName()
	{
		Assert.assertTrue(cardloadpage.cardHolderName());
	}
	
	
	
	/* 
	@Test(priority=3)
	public void verifyCardType()
	{
		//testutil.swtichToFrame();
		cardloadpage.clickOnDropdown();
		cardloadpage.selectingCard();
		//Assert.assertTrue(cardloadpage.cardType());
	}
	
	@Test(priority=4)
	public void Amount()
	{
		cardloadpage.amount(prop.getProperty("Amount"));
	}
	
	@Test(priority=5)
	public void btn()
	{
		cardloadpage.loadAmtBtn();
	}
	
	
	@AfterMethod()
	public void teardown()
	{
		driver.quit();
	}
	
	*/

	
	

}
