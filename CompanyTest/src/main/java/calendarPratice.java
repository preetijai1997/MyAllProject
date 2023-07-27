import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calendarPratice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\bs0452\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.path2usa.com/travel-companion/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,750)", "");
		Thread.sleep(4000);
		driver.findElement(By.id("form-field-travel_comp_date")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='flatpickr-next-month']")).click();

		List<WebElement> dates = driver.findElements(By.xpath("//span[@tabindex=\"-1\"]"));
		System.out.println(dates.size());

		WebElement datePicker = driver.findElement(By.xpath("//span[@aria-label='September 11, 2022']"));
		
		datePicker.click();
		
		Thread.sleep(3000);
	String dateValue=	driver.findElement(By.id("form-field-travel_comp_date")).getText();
	System.out.println(dateValue);

	}

}
