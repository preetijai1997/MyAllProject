package com.preeti.google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class YouTubeTest {
 static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, FindFailed {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bs0452\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.get("https://www.youtube.com/watch?v=OtQAMoXYqes&list=PLFGoYjJG_fqo4oVsa6l_V-_7-tzBnlulT&index=22");
	    
	    Thread.sleep(3000);
	    
	    Screen s =new Screen();
	    
	    Pattern pauseImg=new Pattern("YT_Pause.PNG");
	    

	}

}
