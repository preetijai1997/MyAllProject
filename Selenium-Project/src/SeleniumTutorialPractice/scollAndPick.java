package SeleniumTutorialPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class scollAndPick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bs0452\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		
		//driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")).click();
		WebElement radiobtn=driver.findElement(By.id("doi0"));
		Actions action=new Actions(driver);
		action.moveToElement(radiobtn);
		
		driver.findElement(By.id("interest_market_c0")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("interest_market_c0")).click();
		
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		
	}

}
