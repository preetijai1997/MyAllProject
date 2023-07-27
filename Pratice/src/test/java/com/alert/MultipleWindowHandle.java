package com.alert;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bs0452\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://demo.guru99.com/popup.php");
		
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Click Here")).click();
	String Parent=	driver.getWindowHandle();
	
	Set<String >child=driver.getWindowHandles();
	
	Iterator<String> i1=child.iterator();
	
	while(i1.hasNext())
	{
		
	String childWindow=	i1.next();
		if(!Parent.equalsIgnoreCase(childWindow))
		{
			driver.switchTo().window(childWindow);
			driver.findElement(By.name("emailid")).sendKeys("preetijaiswal504@gmail.com");
			driver.findElement(By.name("btnLogin")).click();
			driver.close();
		}
	}
driver.switchTo().window(Parent);
	}

}
