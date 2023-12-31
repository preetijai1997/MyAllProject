import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class filter {

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver","C:\\Users\\bs0452\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("search-field")).sendKeys("Potato");
		List<WebElement> veggies=driver.findElements(By.xpath("//tr/td[1]"));
		
		List<WebElement> filter=veggies.stream().filter(s->s.getText().contains("Potato")).collect(Collectors.toList());
		Assert.assertEquals(veggies.size(), filter.size());
		
	}
}
