package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bs0452\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		 driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\bs0452\\Desktop\\Selenium.png");
		Thread.sleep(4000);
		driver.findElement(By.id("file-submit")).click();
			

	}

}
