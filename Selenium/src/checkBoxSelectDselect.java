import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class checkBoxSelectDselect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bs0452\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		
		WebElement elem=driver.findElement(By.id("doi0"));
		Actions action=new Actions(driver);
		action.moveToElement(elem);
		action.perform();
		Thread.sleep(4000);
		
		driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='interest_market_c0']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("interest_market_c0")).click();
		
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		
		
	}

}
