package allure;



import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class TestCase {
	
	@Test(priority=1)
	@Description("Login Info")
	@Severity(SeverityLevel.CRITICAL)
	public void doLogin()
	{
		System.out.println("Login has been successful.");
	}
	
	@Test(priority=2)
	@Attachment
	@Description("SignUp Info")
	@Severity(SeverityLevel.BLOCKER)
	public void doSignUp()
	{
		Assert.fail("Signup is failed");
	}
	
	@Test(priority=3)
	@Description("Hone Page Info")
	
	public void homePage()
	{
		throw new SkipException("Home page not landed due to some technical failure");
	}
	
	@Test
	@Attachment
	public void failTest()
	{
		Assert.fail("Failed due to 404 page");
	}
	
	
	

}
