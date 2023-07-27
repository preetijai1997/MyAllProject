package bankit;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.testng.Assert;

public class DownloadFile {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\bs0452\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		String downloadFilePath="C:\\Users\\bs0452\\Downloads";
		HashMap<String, Object> chromePrefs= new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_setting.popups", 0);
		chromePrefs.put("download.profile_content", downloadFilePath);
		
		ChromeOptions chrome= new ChromeOptions();
		
		chrome.setExperimentalOption("prefs", chromePrefs);
//		chrome.addArguments("--test type--");
//		chrome.addArguments("--disable- options--");
		chrome.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		driver= new ChromeDriver(chrome);
		driver.get("https://uat.bankit.in/RO/");
		
		String username = "shobhit.rai@bankit.in";
		// Password
		String pass = "12345";

		String mobNo = "8957181611";
		String holderName = "Preeti Jaiswal";
		// Enter URL
		driver.get("https://uat.bankit.in/RO/");
		driver.switchTo().frame("Main");

		// check heading name
		String headingName = driver.findElement(By.xpath("//font[@color='#95a9c4']")).getText();
		System.out.println("Heading name is: " + headingName);

		// Verify heading name
		Assert.assertEquals(headingName, "RETAILER LOGIN");

		// Enter Login Details
		driver.findElement(By.name("userName")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.id("login")).click();
		

		// sleep for some time
		Thread.sleep(4000);

		// After Login click on Popup
		driver.findElement(By.xpath("//div[@id='popup']/div/div/button[@class='close']")).click();
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,750)");
		
		driver.findElement(By.linkText("AEPS Service Tutorial (step by step)")).click();
		
	}

}
