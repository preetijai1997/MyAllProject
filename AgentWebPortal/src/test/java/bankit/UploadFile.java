package bankit;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UploadFile {
	WebDriver driver;
//public RemoteWebDriver driver;
@BeforeClass
public void setUp() throws Exception {
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\bs0452\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}

@Test
public void UploadTest() throws Exception {
driver.get("https://github.com/settings/profile");
Thread.sleep(2000);// Xpath for Edit button

WebElement file = driver.findElement(By.xpath("//div[@class='position-absolute bg-gray-dark rounded-2 text-white px-2 py-1 left-0 bottom-0 ml-2 mb-2']"));
file.click(); //link text locator for uploading a photo..
WebElement addFile = driver.findElement(By.linkText("Upload a photo..."));
addFile.click();
// Mention the own path of the file location

// Add file method 
addFile.sendKeys("C:\\Users\\bs0452\\Downloads\\2190_essentialcertificate (6).png");// For setting a profile picture

driver.findElement(By.linkText("Set new profile picture")).click();
Thread.sleep(2000);// Image name can be of your choice

if(driver.findElement(By.xpath(".//a[text()='caps.jpeg']")).isDisplayed()) {
assertTrue(true, "Profile picture is Uploaded");
}else {
assertTrue(false, "Profile picture not Uploaded");
}
}
//@AfterClass
//public void tearDown() throws Exception {
//driver.quit();
//}
}