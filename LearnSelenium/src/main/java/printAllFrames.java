import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class printAllFrames {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bs0452\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://uat.bankit.in/RO/");
       List<WebElement> ele= driver.findElements(By.tagName("frame"));
       for(WebElement el: ele)
       {
    	   System.out.println("Frame id"+ el.getAttribute("id"));
    	   
    	   System.out.println("Frame name "+ el.getAttribute("name"));
       }

	}

}
