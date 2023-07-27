package login;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class PortalLogin {

	public static void main(String[] args) throws MalformedURLException {
		
		ChromeOptions browserOptions = new ChromeOptions();
		browserOptions.setPlatformName("Windows 10");
		//browserOptions.setBrowserVersion("latest");
		Map<String, Object> sauceOptions = new HashMap<String, Object>();
		sauceOptions.put("build", "selenium-build-GWJTW");

		browserOptions.setCapability("sauce:options", sauceOptions);

		URL url = new URL("https://oauth-preetijaiswal504-095a3:b7844f21-626c-457b-8918-bf598986a030@ondemand.eu-central-1.saucelabs.com:443/wd/hub");
				RemoteWebDriver driver = new RemoteWebDriver(url, browserOptions);
		
		driver.get("https://portal.bankit.in:9090/RO/");
		   driver.manage().window().maximize();
		   driver.switchTo().frame("Main");
		   
		   driver.findElement(By.name("userName")).sendKeys("8957181611");
		   driver.findElement(By.id("password")).sendKeys("119705");
		   driver.findElement(By.id("login")).click();
		   
		   System.out.println("Login Successfully");
			System.out.println("-------------------Login Page--------------------");
	}
	

}
