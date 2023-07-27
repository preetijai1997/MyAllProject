package bankit;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class MoveToBankTest {

	public static void main(String[] args) throws InterruptedException, IOException {
		
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\bs0452\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();

			// UserName
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
			// Click on Settlement
			driver.findElement(By.id("95")).click();
			
			List<WebElement> HeadingNameOfSettlement = driver
					.findElements(By.xpath("//div[contains(@class,'radio-div-0')]/strong"));

			for (int i = 0; i < HeadingNameOfSettlement.size(); i++) {
				String Name = HeadingNameOfSettlement.get(i).getText();
				System.out.println(Name);
			}
			
			driver.findElement(By.id("registerbankname")).click();
			WebElement ele = driver.findElement(By.id("registerType"));
			Select settlementType = new Select(ele);
			settlementType.selectByValue("INSTANT PAYOUT");
			Thread.sleep(3000);
			driver.findElement(By.id("mobileNo")).sendKeys(mobNo);
			driver.findElement(By.id("holdername")).sendKeys(holderName);
			WebElement BankAcNo = driver.findElement(By.name("accountno"));
			BankAcNo.sendKeys("0035104000177782");
			WebElement ConfirmBankAcNo = driver.findElement(By.id("confirmaccountno"));
			ConfirmBankAcNo.sendKeys("0035104000177782");
			// Assert.assertEquals(BankAcNo, ConfirmBankAcNo);
			Thread.sleep(4000);
			WebElement bankName = driver.findElement(By.id("bankname"));
			Select selectBank = new Select(bankName);

			selectBank.selectByValue("IDBI Bank");
			Thread.sleep(3000);
			//Actions ac= new Actions(driver);
			WebElement ChequeBook=driver.findElement(By.xpath("//div[@id='chequeBlock']/div[2]"));
			//ChequeBook.click();
			//Thread.sleep(3000);
//			ac.moveToElement(ChequeBook).build().perform();
//			Thread.sleep(3000);

			//ChequeBook.sendKeys("C:\\Users\\bs0452\\Pictures\\1mg_LabTest.PNG");
			//driver.findElement(By.id("register")).click();
			ChequeBook.click();
			Thread.sleep(3000);
			Runtime.getRuntime().exec("C:\\Users\\bs0452\\Desktop\\AutoITImage\\ImageUpload.exe");
			
			driver.findElement(By.id("register")).click();
			
			Thread.sleep(3000);
			System.out.println(driver.findElement(By.xpath("//form[@id='registerbank-submit-form']/div/h4")).getText());



	}

}
