
package com.ro.qa.testcase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenerateLog {

	public static void main(String[] args) {
		
		WebDriver driver;
		
		Logger log= Logger.getLogger(GenerateLog.class);
		
		System.setProperty("webdriver.chrome.driver", "\\Users\\bs0452\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 driver= new ChromeDriver();
		 
		 log.info("Launch the browser");
		 
		 driver.get("https://uat.bankit.in/RO/");
		 log.info("Agent Portal has been launched");
		 
		 driver.switchTo().frame("Main");
		 log.info("frame has been initialized");
		 
		 driver.findElement(By.name("userName")).sendKeys("shobhit.rai@bankit.in");
		 log.info("username has been entered");
		 
		 driver.findElement(By.id("password")).sendKeys("Amit@123");
		 log.info("password has been entered.");
		 
		 driver.findElement(By.id("login")).click();
		 log.info("click on login btn");
		 
		  String title= driver.getTitle();
		 System.out.println("Title is==="+ title);
		 
		 log.info("Title is ==="+title);
	}

}
