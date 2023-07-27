package com.calendaerhandle;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javaprogram.util.concurrent.TimeUnit;

public class CalebdarHandleByJS {

	public static WebDriver driver;
	 static String url="https://www.spicejet.com/";

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bs0452\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);
		driver.manage().window().maximize();
		
	WebElement date=	driver.findElement(By.xpath("//div[@data-testid='departure-date-dropdown-label-test-id']"));
		String dayValue="Sat, 16 Apr 2022";
		selectdateByJs(driver,date,dayValue);
		}
	
	public static void selectdateByJs(WebDriver driver, WebElement element, String dayValue)
	{
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		js.executeScript("arguments[0].setAttribute('value','"+dayValue+"');", element);
	}

}
