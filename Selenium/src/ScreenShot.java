import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ScreenShot {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bs0452\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.topster.net/text/kolorieren.html");
		System.out.println(driver.findElement(By.xpath("//label[@for='wort']")).getCssValue("font-size"));
		System.out.println(driver.findElement(By.xpath("//label[@for='wort']")).getCssValue("font-colour"));

		System.out.println(driver.findElement(By.xpath("//label[@for='wort']")).getCssValue("font-type"));

		System.out.println(driver.findElement(By.xpath("//label[@for='wort']")).getCssValue("backgroud-colour"));
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(ChromeDriver.CHROMEDRIVER_ENSURE_CLEAN_SESSION, 
		true);
	}

}
