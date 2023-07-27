import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiselectdropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bs0452\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://www.softwaretestingmaterial.com/sample-webpage-to-automate/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1900)");
		Thread.sleep(2000);
		WebElement mdrop=driver.findElement(By.xpath("//p[text()='Multiple Select Values']//select[@class='spTextField']"));
		Select select=new Select(mdrop);
		select.selectByIndex(2);
		select.selectByValue("msmanual");
		
	List<WebElement>mdropdown=	select.getAllSelectedOptions();
	System.out.println(mdropdown.size());
	
	select.deselectByIndex(2);
	
	List<WebElement>mdropdown1=	select.getAllSelectedOptions();
	System.out.println(mdropdown1.size());
	for(int i=0;i<mdropdown1.size();i++)
	{
		System.out.println(mdropdown1.get(i).getText());
	}

	}

}
