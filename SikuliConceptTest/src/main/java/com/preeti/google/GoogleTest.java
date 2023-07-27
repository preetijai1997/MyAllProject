package com.preeti.google;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class GoogleTest {

	public static void main(String[] args) throws FindFailed {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bs0452\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://www.google.com");
		
		Screen s=new Screen();
		Pattern p= new Pattern("Google Search.PNG");
		s.wait(p,2000);
		s.click();
		s.click();
		
		Pattern p1= new Pattern("SignInBtn.PNG");
		s.wait(p1,2000);
		s.click();
		s.click();
			
	}

}
