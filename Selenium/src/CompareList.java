import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public final class CompareList {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\bs0452\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		// driver.findElement(By.linkText("Top Deals")).click();
		Thread.sleep(2000);

		// click on Veg/Fruit Name
		driver.findElement(By.xpath("//tr/th[1]")).click();

		// Grab all the element into list
		List<WebElement> elementList = driver.findElements(By.xpath("//tr/td[1]"));

		// Capture all the text
		List<String> originalList = elementList.stream().map(s -> s.getText()).collect(Collectors.toList());
		System.out.println(originalList);

		// sorted the text
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList); 

		Assert.assertTrue(originalList.equals(sortedList));
		List<String> pricevalue;
do {
	List<WebElement> row = driver.findElements(By.xpath("//tr/td[1]"));
		 pricevalue = row.stream().filter(s -> s.getText().contains("Mango"))
				.map(s -> getPriceVeggie(s)).collect(Collectors.toList());
		if(pricevalue.size()<1)
		{
			driver.findElement(By.xpath("[aria-label='Next']")).click();
		}
		pricevalue.forEach(s -> System.out.println(s));
	}while(pricevalue.size()<1);
	}

	private static String getPriceVeggie(WebElement s) {
		String pricevalue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return pricevalue;

	}

}
