import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class NoOfRows {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bs0452\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		/*
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,450)", "");
	
	List<WebElement> el=driver.findElements(By.xpath("//table[@id=\"countries\"]//tr"));
	int rows=el.size();
	System.out.println(rows);

		
		driver.get("https://www.selenium.dev/");
	WebElement el=	driver.findElement(By.xpath("//h4[contains(text(),'Selenium WebDriver')]"));
	String text=el.getText();
	
	Assert.assertEquals("Selenium WebDriver", el);
	

		driver.get("https://www.google.com/search?q=selenium&rlz=1C1ONGR_enIN981IN981&oq=se&aqs=chrome.0.69i59j69i57j0i131i433i512j0i433i512j69i60l4.5586j0j7&sourceid=chrome&ie=UTF-8");
	WebElement elw=	driver.findElement(By.xpath("//h2[@data-attrid=\"title\"]//span"));
	
	Actions action=new Actions(driver);
	action.doubleClick(elw).build().perform();
	
		*/
		
		driver.get("https://www.google.com/");
		WebClient wc=new WebClient();
	}
	

}
