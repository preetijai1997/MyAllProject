

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class practice1 {
	
	@Test
	public void Test()
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\bs0452\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		WebElement ele=driver.findElement(By.xpath("//tr/th[1]"));
		ele.click();
		List<String> price;
		do {
	List<WebElement> name=	driver.findElements(By.xpath("//tr/td[1]"));
	List<String> a1=  name.stream().map(s->s.getText()).collect(Collectors.toList());
	
List<String> a2=	a1.stream().sorted().collect(Collectors.toList());

Assert.assertTrue(a1.equals(a2));

 price=name.stream().filter(s->s.getText().contains("Guava")).map(s->getPriceVeggies(s)).collect(Collectors.toList());
price.forEach(a->System.out.println(a));

if(price.size()<1)
{
	
	driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
}
	
		}while(price.size()<1);}

	private String getPriceVeggies(WebElement s) {
		
		
	String priceValue=	  s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return priceValue;
	}

}
