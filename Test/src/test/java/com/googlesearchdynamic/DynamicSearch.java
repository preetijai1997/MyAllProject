package com.googlesearchdynamic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javaprogram.util.List;

public class DynamicSearch {
static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bs0452\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver= new ChromeDriver();
		 
		 driver.get("https://www.google.com");
		 driver.findElement(By.name("q")).sendKeys("java");
		 
		List<WebElement> li= driver.findElements(By.xpath("//ul[1]//div[1]//ul//li[1]//div[2]/div//span"));
		System.out.println(li.size());
		
		for(int i=0;i<li.size();i++)
		{
		System.out.println(li.get(i).getText());
		
		}
		 
	}

}

//ul[1]//div[1]//ul//li[1]//div[2]/div//span[contains(text(),'java')]
