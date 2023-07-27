

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class testngProgram {
	
	
	@Test
	public void Test()
	{
		System.out.println("Test First Name Field");
	}
	
	@BeforeSuite
	public void openURL()
	{
		System.out.println("First open URL");
	
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Enter username and password");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Click on login button");
	}

	@BeforeMethod
	public void clickDMT()
	{
		System.out.println("Click the DMT module");
	}
	
	@AfterMethod
	public void testField()
	{
		System.out.println("Check validation of first field");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("Accept alphabets only");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("Check all the functionality");
	}
	
	@AfterSuite
	public void logout()
	{
		System.out.println("Logout from application");
	}
}
