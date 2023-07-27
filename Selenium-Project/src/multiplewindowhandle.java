import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiplewindowhandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bs0452\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.salesforce.com/au/");
		driver.findElement(By.xpath("//*[@id=\"main\"]/div[3]/div/div/div/div[2]/div[1]/div[1]/div[3]/div/div[2]/div/div[1]/div/div[1]/div/a")).click();
		
		Set<String> windowhandle=driver.getWindowHandles();
		System.out.println(windowhandle);
		
	Iterator<String> it=windowhandle.iterator();
	String parentWindow =it.next();
	System.out.println(parentWindow);
	String childWindow=it.next();
	System.out.println(childWindow);
	
	driver.switchTo().window(childWindow);
	
	driver.findElement(By.name("UserFirstName")).sendKeys("Preeti");
	driver.findElement(By.name("UserLastName")).sendKeys("Jaiswal");
	driver.findElement(By.name("UserEmail")).sendKeys("preeti.jaiswal@bankit.in");
	WebElement dropdown=driver.findElement(By.name("UserTitle"));
	Select select=new Select(dropdown);
	select.selectByIndex(2);
	driver.findElement(By.name("UserPhone")).sendKeys("8957181611");
	WebElement dropdown1=driver.findElement(By.name("CompanyCountry"));
	Select select1=new Select(dropdown1);
	select1.selectByValue("AS");
	Thread.sleep(4000);
	driver.findElement(By.cssSelector("input[id='SubscriptionAgreement']+div[class='checkbox-ui']")).click();
	driver.findElement(By.name("start my free trial")).click();
	Thread.sleep(4000);
	
	driver.switchTo().window(parentWindow);

	}

}
