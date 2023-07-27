import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class filterVeggies {
	
	
	@Test
	public void filter()
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\bs0452\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.id("search-field")).sendKeys("Cheese");
		
		List <WebElement> veggies=driver.findElements(By.xpath("//tr/td[1]"));
		List<WebElement> filterVeggie= veggies.stream().filter(veggie->veggie.getText().contains("Cheese")).collect(Collectors.toList());
		//filterVeggie.forEach(vegg->vegg.findElements(By.xpath("//tr/td")));
		//System.out.println(filterVeggie);
		
		Assert.assertEquals(veggies.size(), filterVeggie.size());
		
		
	}

}
