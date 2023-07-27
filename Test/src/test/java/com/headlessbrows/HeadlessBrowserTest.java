package com.headlessbrows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import javaprogram.util.concurrent.TimeUnit;

public class HeadlessBrowserTest {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\bs0452\\Downloads\\chromedriver_win32\\chromedriver.exe");
 		 //driver= new ChromeDriver();
		 
		 driver=new HtmlUnitDriver();
 		driver.manage().window().maximize();
 		driver.manage().deleteAllCookies();
 		
 		//dynamic Wait
 		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
 		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
 		
 		driver.get("https://ui.freecrm.com/");
 		System.out.println("Before login title==="+ driver.getTitle());
 		
 		driver.findElement(By.name("email")).sendKeys("naveenk");
 		driver.findElement(By.name("password")).sendKeys("test@123");
 		Thread.sleep(3000);
 		driver.findElement(By.linkText("Login")).click();
 		Thread.sleep(3000);
 		System.out.println("After login title==="+ driver.getTitle());

	}

}
