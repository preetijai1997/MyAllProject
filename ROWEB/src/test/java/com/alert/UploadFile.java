package com.alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bs0452\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://codepen.io/adambene/pen/xRWrXN");
		driver.switchTo().frame("result");
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//button[@class='btn']")).getText());
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='btn']")).click();

	}

}