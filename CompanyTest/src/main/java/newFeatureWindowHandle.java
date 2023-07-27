import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class newFeatureWindowHandle {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\bs0452\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		Set<String> windows=driver.getWindowHandles();
	Iterator<String> i1=	windows.iterator();
	String parentWindow=i1.next();
    String childWindow=	i1.next();
    driver.switchTo().window(childWindow);
    driver.get("https://rahulshettyacademy.com/");
    String links=driver.findElements(By.xpath("//a[contains(@href,'https://courses.rahulshettyacademy.com/p/')]")).get(1).getText();
	driver.switchTo().window(parentWindow);
WebElement name=	driver.findElement(By.name("name"));
      name.sendKeys(links);
     File file= name.getScreenshotAs(OutputType.FILE);
     FileUtils.copyFile(file, new File("C:\\Users\\bs0452\\eclipse-workspace\\CompanyTest\\test-output\\name.png"));
	
	}

}
