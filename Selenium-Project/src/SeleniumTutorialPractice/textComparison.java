package SeleniumTutorialPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class textComparison {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bs0452\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://extendsclass.com/text-compare.html");
	WebElement Source=	driver.findElement(By.xpath("//*[@id=\"dropZone\"]/div[2]/div/div[6]/div[1]/div/div/div/div[5]"));
		Actions action=new Actions(driver);
		Thread.sleep(3000);
		action.keyDown(Source, Keys.CONTROL).sendKeys("a").sendKeys("c").perform();
		
		WebElement dest=driver.findElement(By.xpath("//*[@id=\"dropZone2\"]/div[2]/div/div[6]/div[1]/div/div"));
		Thread.sleep(3000);
		action.keyDown(dest, Keys.CONTROL).sendKeys("a").sendKeys("v").perform();
		
		
	}

}
