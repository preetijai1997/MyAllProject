import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bs0452\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/flights/?cmp=SEM|D|DF|G|Brand|B_M_Makemytrip_Variants|Brand-Flight-Variants-Exact|ETA|Regular|V2|529647797692&s_kwcid=AL!1631!3!529647797692!e!!g!!www%20makemytrip%20com%20flight&ef_id=EAIaIQobChMIruyO17HI9QIV6pNmAh1DUg5uEAAYASAAEgKNlPD_BwE:G:s&gclid=EAIaIQobChMIruyO17HI9QIV6pNmAh1DUg5uEAAYASAAEgKNlPD_BwE");
		driver.findElement(By.xpath("//span[text()='From']"));
		WebElement city=driver.findElement(By.id("fromCity"));
		city.sendKeys("Sydney");
		Thread.sleep(2000);
		city.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		city.sendKeys(Keys.ENTER);
	}

}
