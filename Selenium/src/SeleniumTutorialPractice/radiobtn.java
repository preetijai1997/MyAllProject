package SeleniumTutorialPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobtn {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bs0452\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.singaporeair.com/en_UK/in/home?gclid=EAIaIQobChMIwLjiwfzj9QIV1JVLBR21_A2JEAAYAiAAEgKbVfD_BwE#/book/bookflight");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)");
		
		WebElement radiobtn=driver.findElement(By.id("redeemFlights"));
		Thread.sleep(3000);
		radiobtn.click();
		System.out.println(radiobtn.isSelected());
		
		List<WebElement> totalRadiobtn=driver.findElements(By.name("book-flight-radio"));
		System.out.println(totalRadiobtn.size());
		
		
	}

}
