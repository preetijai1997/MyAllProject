package com.windowhandler;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javaprogram.util.Iterator;
import javaprogram.util.Set;

public class WindowHandlerTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bs0452\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://medium.com/geekculture/web-based-multi-screen-apps-including-drag-drop-5e161da6507b");
		
		Thread.sleep(3000);
		
		WebElement ele=driver.findElement(By.xpath("//*[@id=\"14d0\"]/a"));
	   JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("argument[0].click();", ele);
	Set<String> handles=driver.getWindowHandles();
	  Iterator it=handles.iterator();
	  
	String ParentId= (String) it.next();
	System.out.println("Parent ID is:"+ ParentId);
	
	String ChildId= (String) it.next();
	System.out.println("Child ID is:"+ ChildId);
	
	driver.switchTo().window(ChildId);
	System.out.println("Title of child window is :"+ driver.getTitle());
	
	driver.close();
	
	Thread.sleep(3000);
	driver.switchTo().window(ParentId);
	System.out.println("Title of parent window is :"+ driver.getTitle());
	
	driver.close();
	

	}

}
