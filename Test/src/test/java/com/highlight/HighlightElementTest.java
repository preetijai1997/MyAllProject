package com.highlight;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighlightElementTest
{
	static WebDriver driver;
	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bs0452\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver= new ChromeDriver();
		 
		 driver.get("https://www.google.com");
		 
		WebElement signbtn= driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[2]/a"));
		flash(signbtn,driver);
		drawBorder( signbtn,driver);
	
		
		//File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(file, new File("C:\\Users\\bs0452\\eclipse-workspace\\Test\\ScreenShot\\test2.png"));
		//alertMessage(driver,"There is problem in signin button");
		
		//clickonElement(signbtn,driver);
		refreshBrowser(driver);
		System.out.println(getTitle(driver));
		
		System.out.println(getPageContent(driver));
		pageScrollTo(driver);
		
		
	WebElement ele=	driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div[2]/a[1]"));
		scrollIntoView(ele,driver);
	}
	
	public static void flash( WebElement element, WebDriver driver)
	{
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		String bgColor= element.getCssValue("backgroundColor");
		for(int i=0;i<4;i++)
		{
			changeColor("rgb(0,200,00)",element,driver);
			changeColor(bgColor,element,driver);
		}
	}
		
		public static void changeColor(String color,WebElement element,WebDriver driver  )
		{
			JavascriptExecutor js= ((JavascriptExecutor)driver);
			js.executeScript("arguments[0].style.backgroundColor= '" +color+ "'",element);
			try
			{
				Thread.sleep(3000);
			}
			catch(InterruptedException e)
			{
				
			}
		}
		
		public static void drawBorder(WebElement element,WebDriver driver)
		{
			JavascriptExecutor js= ((JavascriptExecutor)driver);
			js.executeScript("arguments[0].style.border= '3px solid red' ", element);
		}
		
		public static void alertMessage(WebDriver driver,String message)
		{
			JavascriptExecutor js= ((JavascriptExecutor)driver);
			js.executeScript("alert('"+message+"')");
		}
		
		public static void clickonElement(WebElement element,WebDriver driver)
		{
			JavascriptExecutor js= ((JavascriptExecutor)driver);
			js.executeScript("arguments[0].click();", element);
		}
		
		public static void refreshBrowser(WebDriver driver)
		{
			JavascriptExecutor js= ((JavascriptExecutor)driver);
			js.executeScript("history.go(0)");
		}
		
		
		
		public static String getTitle(WebDriver driver)
		{
			JavascriptExecutor js= ((JavascriptExecutor)driver);
		String title=	js.executeScript("return document.title;").toString();
			return title;
		}
		
		public static String getPageContent(WebDriver driver)
		{
			JavascriptExecutor js= ((JavascriptExecutor)driver);
		String PageContent=	js.executeScript("return document.documentElement.innerText;").toString();
			return PageContent;
		}
		
		public static void pageScrollTo(WebDriver driver)
		{
			JavascriptExecutor js= ((JavascriptExecutor)driver);
			js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		}
		
		public static void scrollIntoView(WebElement element, WebDriver driver)
		{
			JavascriptExecutor js= ((JavascriptExecutor)driver);
			js.executeScript("arguments[0].scrollIntoView(true)", element);
		}
	}


