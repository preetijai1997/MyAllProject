package bankit;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class WebPortalTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\bs0452\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// UserName
		String username = "preeti.jaiswal@bankit.in";
		// Password
		String pass = "Preeti123@";

		String mobNo = "8957181611";
		String holderName = "Preeti Jaiswal";
		// Enter URL
		driver.get("https://portal.bankit.in:9090/RO/");
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

		// Click on Settlement
		driver.findElement(By.id("39")).click();

		// List of heading name

		List<WebElement> HeadingNameOfSettlement = driver
				.findElements(By.xpath("//div[contains(@class,'radio-div-0')]/strong"));

		for (int i = 0; i < HeadingNameOfSettlement.size(); i++) {
			String Name = HeadingNameOfSettlement.get(i).getText();
			System.out.println(Name);
		}

		driver.findElement(By.id("registerbankname")).click();

		// select settlement account type
		WebElement ele = driver.findElement(By.id("registerType"));
		Select settlementType = new Select(ele);
		settlementType.selectByValue("AEPS & MICROATM");
		Thread.sleep(3000);
		driver.findElement(By.id("mobileNo")).sendKeys(mobNo);
		driver.findElement(By.id("holdername")).sendKeys(holderName);
		WebElement BankAcNo = driver.findElement(By.name("accountno"));
		BankAcNo.sendKeys("0035104000177788");
		WebElement ConfirmBankAcNo = driver.findElement(By.id("confirmaccountno"));
		ConfirmBankAcNo.sendKeys("0035104000177788");
		// Assert.assertEquals(BankAcNo, ConfirmBankAcNo);
		Thread.sleep(4000);
		WebElement bankName = driver.findElement(By.id("bankname"));
		Select selectBank = new Select(bankName);

		selectBank.selectByValue("IDBI Bank");

		driver.findElement(By.id("verify-btn")).click();

		System.out.println(driver.findElement(By.xpath("//form[@id='registerbank-submit-form']/div/h4")).getText());

		List<WebElement> tableData = driver
				.findElements(By.xpath("//div[@id='verification-confirmation']/table/tbody/tr/td/strong"));
		for (int i = 0; i < tableData.size(); i++) {
			String data = tableData.get(i).getText();
			System.out.println("Data of column name is: " + data);
		}
	}
}