import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

import org.openqa.selenium.Alert;
public class tataMg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\bs0452\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.1mg.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='style__close-icon___3FflV']")).click();
		Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@class='UpdateCityModal__cancel-btn___2jWwS UpdateCityModal__btn___oMW5n']")).click();
     driver.findElement(By.xpath("//a[@class='styles__login-link___2PwqA'][1]")).click();
     Thread.sleep(4000);
     driver.findElement(By.xpath("//input[@class='style__input___3NmkT']")).sendKeys("8840314617");
     driver.findElement(By.xpath("//a[@class='button-text']")).click();
     Thread.sleep(2000);
     driver.findElement(By.xpath("//input[@class='style__input___3NmkT']")).sendKeys("691841");
     driver.findElement(By.xpath("//a[@class='button-text']")).click();
	
	
	//		WebElement labelPhone=driver.findElement(By.xpath("//label[@for='phone']"));
//		driver.findElement(with(By.tagName("label")).below(labelPhone)).sendKeys("8840314617");

	}

}
