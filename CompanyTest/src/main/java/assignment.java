import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bs0452\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		/*driver.get("https://the-internet.herokuapp.com/windows");
		driver.findElement(By.xpath("//div[@id='content']/div/a")).click();
		Set<String> window=driver.getWindowHandles();
		
	Iterator<String> i1=	window.iterator();
	
String parentWindow=	i1.next();
String childWindow=i1.next();
driver.switchTo().window(childWindow);
System.out.println(driver.findElement(By.xpath("//div[@class='example']/h3")).getText());

driver.switchTo().window(parentWindow);

System.out.println(driver.findElement(By.xpath("//div[@class='example']/h3")).getText());
	*/
		
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		driver.switchTo().frame("frame-top");
		
		driver.switchTo().frame("frame-middle");
		
	String contentName=	driver.findElement(By.id("content")).getText();
	System.out.println(contentName);
	}

}
