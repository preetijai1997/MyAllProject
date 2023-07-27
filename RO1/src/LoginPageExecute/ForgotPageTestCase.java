package LoginPageExecute;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import LoginPageObeject.ForgotPage;

public class ForgotPageTestCase {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bs0452\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://uat.bankit.in/RO1/");
		Thread.sleep(3000);
		driver.switchTo().frame("Main");
		driver.manage().window().maximize();
		
		ForgotPage forget=new ForgotPage(driver);
        forget.clickForgotPass.click();
        
		forget.txtEmail.sendKeys("Shobhit.rai@bankit.in");
		forget.btnSubmit.click();
		
		forget.enterOTP.sendKeys("674151");
		
		forget.btnSubmit1.click();
		driver.close();

	}

}
