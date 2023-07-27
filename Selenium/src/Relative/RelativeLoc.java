package Relative;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class RelativeLoc {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\bs0452\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
         WebElement nameEditbox=driver.findElement(By.name("name"));
		System.out.println(driver.findElement(with(By.tagName("label")).above(nameEditbox)).getText());
		WebElement dateOfBirth=driver.findElement(By.cssSelector("[for='dateofBirth']"));
		driver.findElement(with(By.tagName("input")).below(dateOfBirth)).click();
		
	WebElement cbox=driver.findElement(By.cssSelector("[for='exampleCheck1']"));
	driver.findElement(with(By.tagName("input")).toLeftOf(cbox)).click();
	
	WebElement rdb=driver.findElement(By.id("inlineRadio1"));
	System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(rdb)).getText());
	
	WebElement rdb1=driver.findElement(By.cssSelector("[for='inlineRadio1']"));
	driver.findElement(with(By.tagName("input")).toLeftOf(rdb1)).click();
	}


	}


