package com.ro.qa.testcase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ro.qa.baseclass.TestBase;
import com.ro.qa.page.CardPage;
import com.ro.qa.page.HomePage;
import com.ro.qa.page.LoginPage;
import com.ro.qa.utility.TestUtil;

public class HomePageTest extends TestBase {

	LoginPage loginpage;
	HomePage homepage;
	TestUtil testutil;
	CardPage cardpage;
	

	public HomePageTest() throws IOException {
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
		
		}
	
	/*
	@Test(priority=1)
	public void homePageTitleVerify()
	{
		testutil.swtichToFrame();
		String title=homepage.verifyTitle();
	
		Assert.assertEquals(title, "BANKIT SERVICES PRIVATE LIMITED");
	}
	
	@Test(priority=2)
	public void agnameTest()
	{
		testutil.swtichToFrame();
		Assert.assertTrue(homepage.agname());
		
	}
*/
	
	
	@Test(priority=1)
	public void verifyCardPage() throws IOException
	{
		//testutil.swtichToFrame();
		cardpage=homepage.clickOnCardTest();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	

}
