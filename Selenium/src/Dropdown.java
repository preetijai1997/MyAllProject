import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bs0452\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		WebElement dropdowm=driver.findElement(By.xpath("//select[@class='element-container form-control mb-2']"));
		Select select=new Select(dropdowm);
		select.selectByIndex(4);
		Thread.sleep(5000);
		select.selectByValue("level3");
		Thread.sleep(5000);
		select.selectByVisibleText("501 - 1,000 employees");
		Thread.sleep(5000);
		/*
		WebElement dropdowm1=driver.findElement(By.id("children_selector"));
		Select select1=new Select(dropdowm1);
		select1.selectByValue("5");
		Thread.sleep(5000);
		WebElement dropdowm2=driver.findElement(By.id("infant_selector"));
		Select select2=new Select(dropdowm2);
		select2.selectByIndex(4);
		*/
		
		
		
	}

}
