package com.alert;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bs0452\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://codepen.io/adambene/pen/xRWrXN");
		Thread.sleep(3000);
		driver.switchTo().frame("CodePen");
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//button[@class='btn']")).getText());
		Thread.sleep(6000);
	WebElement ele=	driver.findElement(By.xpath("//div[@class='upload-btn-wrapper']//button[@class='btn']"));
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", ele);

	}

}