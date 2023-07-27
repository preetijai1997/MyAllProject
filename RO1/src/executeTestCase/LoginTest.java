package executeTestCase;


import org.testng.Assert;
import org.testng.annotations.Test;

import common.BaseTest;

public class LoginTest extends BaseTest{
	
	
	@Test
	public void launchDriver()
	{
		driver.get("https://uat.bankit.in/RO1/");
		Assert.assertTrue(false);
		
	}

}
