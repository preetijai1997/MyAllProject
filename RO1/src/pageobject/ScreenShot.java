package pageobject;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bs0452\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		TakesScreenshot screenshot= (TakesScreenshot)driver;
	WebElement location=	driver.findElement(By.xpath("//a[@href='/context_menu']"));
		File src=location.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("C:\\Users\\bs0452\\Desktop\\Screenshot\\S1.png"));
		
	}

}
