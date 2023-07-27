package executeTestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageobject.Guru99LoginPageObject;

public class TestCase99 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bs0452\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/v4/");
		Guru99LoginPageObject loginpage=new Guru99LoginPageObject(driver);
		loginpage.txtUserId.sendKeys("mgr123");
		loginpage.txtPass.sendKeys("mgr!23");
		loginpage.btnLogin.click();
				

	}

}
