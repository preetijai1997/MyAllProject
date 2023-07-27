package com.ro.qa.testcase;

import java.io.IOException;

import org.testng.Assert;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ro.qa.baseclass.TestBase;
import com.ro.qa.Page.HomePage;
import com.ro.qa.Page.LoginPage;
import com.ro.qa.testutility.TestUtility;

public class LoginPageTest extends TestBase{

LoginPage loginpage;
HomePage homepage;
TestUtility testutil;
public LoginPageTest() throws IOException
{
	super();
}

@BeforeMethod
public void setup() throws IOException
{
	initialization();
	loginpage=new LoginPage();
	testutil=new TestUtility();
}

@Test(priority=1)
public void bankitLogoTest()
{
	testutil.swtichToFrame();
	boolean flag=loginpage.ImageValidate();
	Assert.assertTrue(flag);
}

@Test(priority=2)
public void validateTitleTest()
{
	String title=loginpage.validateTitle();
	Assert.assertEquals(title, "BANKIT SERVICES PRIVATE LIMITED");
}

@Test(priority=3)
public void loginTest() throws IOException
{
	testutil.swtichToFrame();
	homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	loginpage.cutPopup();
}




/*
@AfterMethod
public void tearDown()
{
	driver.quit();
}

*/

}
