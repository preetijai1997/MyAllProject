import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bs0452\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	driver.get("https://www.ebay.com/");
	driver.manage().window().maximize();
	
	WebElement element=driver.findElement(By.xpath("//li[@data-currenttabindex='1']"));

	Actions action=new Actions(driver);
	action.moveToElement(element).perform();
	}

}
