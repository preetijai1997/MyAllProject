import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterSection {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bs0452\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		WebElement footer=driver.findElement(By.id("gf-BIG"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		WebElement footerSection1=footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(footerSection1.findElements(By.tagName("a")).size());
		for(int i=1;i<footerSection1.findElements(By.tagName("a")).size();i++)
		{
			String controlLinks=Keys.chord(Keys.CONTROL,Keys.ENTER);
			footerSection1.findElements(By.tagName("a")).get(i).sendKeys(controlLinks);
			Thread.sleep(4000);
		}
		Set<String> windowhandle =driver.getWindowHandles();
	    Iterator<String> it=windowhandle.iterator();
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		
		
	}

}
