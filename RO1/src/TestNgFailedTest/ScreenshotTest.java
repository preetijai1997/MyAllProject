package TestNgFailedTest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListener.class)
public class ScreenshotTest extends Base {
	
		
	@BeforeMethod
	public void launchTest()
	{
		initialization();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	@Test
	public void Result1()
	{
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void Result2()
	{
		Assert.assertEquals(false, true);
	}
	
	
	@Test
	public void Result3()
	{
		Assert.assertEquals(false, true);
	}

}
