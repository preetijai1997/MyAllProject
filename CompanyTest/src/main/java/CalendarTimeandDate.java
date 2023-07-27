import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarTimeandDate {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bs0452\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/");
		WebElement datetimePicker=driver.findElement(By.xpath("//input[@name='bdaytime']"));
		datetimePicker.sendKeys("10111997");
		
		datetimePicker.sendKeys(Keys.TAB);
		
		datetimePicker.sendKeys("1010AM");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		//driver.quit();
		

	}

}
