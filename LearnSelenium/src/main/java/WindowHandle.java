import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class WindowHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bs0452\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.findElement(By.id("tabButton")).click();
		String parentWindow=driver.getWindowHandle();
		Set<String> s1=driver.getWindowHandles();
		
		Iterator<String> i1= s1.iterator();
		
		while(i1.hasNext())

		{
			String childWindow=i1.next();
			if(!parentWindow.equalsIgnoreCase(childWindow))
			{
				driver.switchTo().window(childWindow);
				WebElement childWindowText=driver.findElement(By.id("sampleHeading"));
				
			    String contentChild=childWindowText.getText();
			    driver.close();
			    System.out.println("Child window close");
				}
			
			driver.switchTo().window(parentWindow);
		System.out.println("Title of parent window "+ driver.getTitle());
			
		}
	}

}
