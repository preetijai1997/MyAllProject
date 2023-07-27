package executeTestCase;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import common.BaseTest;

public class Reports  extends BaseTest{
	
	@Test
	public void TestCase1()
	{
		Reporter.log("Test 1");
		Assert.assertTrue(false);
		driver.get("uat.bankit.in/RO/");
		System.out.println("This is test case 1");
	}
	
	@Test
	public void TestCase2()
	{
		Reporter.log("Test 2");
		System.out.println("This is test case 2");
	}

}
