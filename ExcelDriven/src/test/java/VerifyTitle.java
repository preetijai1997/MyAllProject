import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class VerifyTitle {

	@Test
	public void Titlepage()
	{
		SoftAssert sa=new SoftAssert();
		String ExpectedTitle="Electronics, Cars, Fashion, Collectibles & More | eBay";
		String expectText="Search";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bs0452\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		String actualTitle=driver.getTitle();
		
	   sa.assertEquals(actualTitle, ExpectedTitle);
	   
	   String actualText=driver.findElement(By.id("gh-btn")).getAttribute("value");
	   sa.assertEquals(actualText, expectText, "This is text validation");
	   
		driver.close();
		sa.assertAll();
	}
}
