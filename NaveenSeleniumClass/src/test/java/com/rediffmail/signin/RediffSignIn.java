package com.rediffmail.signin;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffSignIn {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bs0452\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://mypage.rediff.com/login/dologin");
	    driver.findElement(By.xpath("[@value='Login']"));
		
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		
		
		

	}

}
