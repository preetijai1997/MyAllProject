package pageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchEngine {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bs0452\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Selenium");
		Thread.sleep(3000);
		List<WebElement>li=driver.findElements(By.xpath("//ul/li[@class='sbct']"));
		System.out.println(li.size());
		Thread.sleep(4000);
		for(WebElement suggestion_name:li)
		{
			String suggestion_value=suggestion_name.getText();
			System.out.println(suggestion_value);
			if(suggestion_value.equalsIgnoreCase("selenium interview questions"))
			{
				suggestion_name.click();
			}
			
		}
		
	}

}
