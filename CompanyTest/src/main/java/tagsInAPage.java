import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagsInAPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bs0452\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement footer=		driver.findElement(By.id("gf-BIG"));
//		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement firstSection=footer.findElement(By.xpath("//table[@class='gf-t']/tbody/tr/td[1]/ul"));
		System.out.println(firstSection.findElements(By.tagName("a")).size());
		
		for(int i=1;i<firstSection.findElements(By.tagName("a")).size();i++)
		{
		String clickOnLink=	Keys.chord(Keys.CONTROL,Keys.ENTER);
		firstSection.findElements(By.tagName("a")).get(i).sendKeys(clickOnLink);
		
		Thread.sleep(4000);
		}
		
		Set<String> window=driver.getWindowHandles();
		
	Iterator<String> it=	window.iterator();
	
	while(it.hasNext())
	{
		driver.switchTo().window(it.next());
		
	System.out.println(driver.getTitle());
	}
	}

}
