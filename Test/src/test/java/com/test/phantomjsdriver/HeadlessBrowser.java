package com.test.phantomjsdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class HeadlessBrowser {

	public static void main(String[] args) {
		
		System.getProperty("phantomjs.binary.path", "C:\\Users\\bs0452\\Downloads\\phantomjs-2.1.1-windows\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");

		WebDriver driver=new PhantomJSDriver();
		driver.get("https://uat.bankit.in/RO1/");
		
	String title=driver.getTitle();
	System.out.println("Before Login Title===="+title);
	
	WebElement username=driver.findElement(By.name("userName"));
	username.sendKeys("shobhit.rai@bankit.in");
    WebElement pass=driver.findElement(By.id("password"));
    pass.sendKeys("Amit@123");
   WebElement loginBtn= driver.findElement(By.id("login"));
   loginBtn.click();

   
	System.out.println("After login Title===="+title);
	}

}
