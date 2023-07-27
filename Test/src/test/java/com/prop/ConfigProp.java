package com.prop;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javaprogram.util.Iterator;
import javaprogram.util.Properties;
import javaprogram.util.Set;

public class ConfigProp {
  
	static WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException {
		
		Properties pro=new Properties();
		
		FileInputStream fis= new FileInputStream("C:\\Users\\bs0452\\eclipse-workspace\\Test\\config.properties");
         pro.load(fis);
         
         String username=pro.getProperty("username");
         String password=pro.getProperty("password");
         String Url=pro.getProperty("url");
         
         String brow=pro.getProperty("browser");
         
         if(brow.equals("chrome"))
         {
        	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\bs0452\\Downloads\\chromedriver_win32\\chromedriver.exe");
     		 driver= new ChromeDriver();
     		driver.manage().window().maximize();
     		driver.manage().deleteAllCookies();
     		
         }
         
         else
         {
        	 System.out.println("Browser not found");
        	 
         }
         
         driver.get(Url);
         
         driver.switchTo().frame("Main");
         driver.findElement(By.name("userName")).sendKeys(username);
         driver.findElement(By.id("password")).sendKeys(password);
         driver.findElement(By.id("login")).click();
         Thread.sleep(3000);
         driver.findElement(By.xpath("//*[@id='popup']/div/div/button")).click();
         Thread.sleep(2000);
        // driver.switchTo().frame("Main");
         Actions action=new Actions(driver);
         action.moveToElement(driver.findElement(By.linkText("NEO BANKING"))).build().perform();
         Thread.sleep(3000);
         
         Set<String> windowhandles=driver.getWindowHandles();
        Iterator<String> it= windowhandles.iterator();
        
     String parentWindow=it.next();
     String childWindow=it.next();
     
     driver.switchTo().window(childWindow);
         
         driver.findElement(By.linkText("SAVING ACCOUNT")).click();
         System.out.println(driver.getCurrentUrl());
         
	}

}
