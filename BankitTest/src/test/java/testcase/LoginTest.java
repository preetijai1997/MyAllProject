package testcase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import base.TestBase;


public class LoginTest  extends TestBase{
	
	
	@Test(priority=1)
	public void login() throws InterruptedException, IOException
	{
         
		
	      driver.switchTo().frame(0);
		 log.debug("Frame is initialize");
		verify("abc","xyz");
		Thread.sleep(5000);
	//driver.findElement(By.name(OR.getProperty("username"))).sendKeys(config.getProperty("name"));
		type("username_XPATH","name");
		log.debug("Username is entered");
		
	//	driver.findElement(By.id(OR.getProperty("pass"))).sendKeys(config.getProperty("pass"));
		type("pass_XPATH","pass");
		log.debug("Password is entered");
		
		Thread.sleep(3000);
		click("loginBtn_XPATH");
		//driver.findElement(By.id(OR.getProperty("loginBtn"))).click();
		log.debug("Login button is clicked");
		Reporter.log("Login Successfully");
		//Assert.assertTrue(false);
	//	Assert.fail("Login failed");
		
		
		Assert.assertTrue(elementPresent(driver,OR.getProperty("crossBtn_XPATH")),"Cross button not visible");
		log.debug("Button visibility");
		
		Thread.sleep(3000);
		//driver.findElement(By.xpath(OR.getProperty("crossBtn"))).click();
		click("crossBtn_XPATH");
		
		
		
		
	}

}
