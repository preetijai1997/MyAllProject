package com.disableimg;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DisableImage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bs0452\\Downloads\\chromedriver_win32\\chromedriver.exe");

	  ChromeOptions options=new ChromeOptions();
	  DisableImageChrome(options);
	  WebDriver driver= new ChromeDriver(options);
	  driver.get("https://www.amazon.in/");
	  System.out.println(driver.getTitle());
	}
	
	public static void DisableImageChrome(ChromeOptions options)
	{
		HashMap<String, Object> img=new HashMap<String, Object>();
		img.put("img", 2);
		HashMap<String, Object> prefs=new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values", img);
		options.setExperimentalOption("prefs", prefs);
		
		
	}

}
