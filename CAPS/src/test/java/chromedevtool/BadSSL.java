package chromedevtool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;


public class BadSSL {

	public static void main(String[] args) {
		
		
       WebDriver driver = new ChromeDriver();
		
		DevTools devTools = ((ChromeDriver) driver).getDevTools();
		devTools.createSession();
		
		
		//devTools.send(Security.enable());
		//devTools.send(Security.setIgnoreCertificateErrors(true));
		
		
		driver.get("https://expired.badssl.com");
		
	}

}
