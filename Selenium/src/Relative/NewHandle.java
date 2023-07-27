package Relative;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewHandle {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bs0452\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		//window handle
		driver.switchTo().newWindow(WindowType.TAB);
	Set<String> handles=driver.getWindowHandles();
	Iterator<String> it=handles.iterator();
	String parentWindow=it.next();
	String childWindow=it.next();
	driver.switchTo().window(childWindow);
	driver.get("https://rahulshettyacademy.com/");
	String cname=driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(3).getText();
	driver.switchTo().window(parentWindow);
	WebElement name=driver.findElement(By.name("name"));
	name.sendKeys(cname);
	
	//Screenshot
	File file=name.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(file, new File("logo.png"));
	
	//Get height and Width
	System.out.println(name.getRect().getDimension().getHeight());
	System.out.println(name.getRect().getDimension().getWidth());
	
	
	
		
	}

}
