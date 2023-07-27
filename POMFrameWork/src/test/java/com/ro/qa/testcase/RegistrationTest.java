package com.ro.qa.testcase;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ro.qa.baseclass.TestBase;
import com.ro.qa.page.CardPage;
import com.ro.qa.page.HomePage;
import com.ro.qa.page.LoginPage;
import com.ro.qa.utility.TestUtil;

public class RegistrationTest extends TestBase {

	LoginPage loginpage;
	HomePage homepage;
	TestUtil testutil;
	CardPage cardpage;
	public RegistrationTest() throws IOException {
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
		
		}
	
		/*
		 * @Test public void regisTest() throws IOException {
		 * cardpage.RegistrationIssuancePage(); }
		 */
	
	@Test
	public void cl() throws IOException
	{
		cardpage.CardloadPage();
	}
	
	

}
