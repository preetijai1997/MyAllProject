import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class printalllink {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bs0452\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://sugarcrm.com/au/request-deo/");
	List<WebElement>link=	driver.findElements(By.tagName("a"));
	for(int i=0;i<link.size();i++)
	{
		System.out.println(link.get(i).getAttribute("href"));
		System.out.println(link.get(i).getText());
	}
	
	}

}
