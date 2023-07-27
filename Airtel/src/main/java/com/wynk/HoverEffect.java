package com.wynk;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class HoverEffect {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver= new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bs0452\\Downloads\\browsers\\chromedriver.exe");
		driver.get("https://red.bankit.in/RO_TPIN/");
		driver.switchTo().frame("Main");
		String tooltipText="Now you can enter your transaction pin to do the transactions.";
		driver.manage().window().maximize();
		driver.findElement(By.name("userName")).sendKeys("8957181611");
		driver.findElement(By.id("password")).sendKeys("119705");
		driver.findElement(By.id("login")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//button[@class=\"close\"]/span)[2]")).click();
		driver.findElement(By.xpath("//a[text()='SETTLEMENT']")).click();
		Thread.sleep(7000);
		driver.findElement(By.id("transferbankname")).click();
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,250)", "");
		WebElement hoverI=driver.findElement(By.xpath("//div[@class=\"tooltip1\"]"));
		Actions ac= new Actions(driver);
		//Thread.sleep(10000);
		ac.moveToElement(hoverI).build().perform();
		Thread.sleep(10000);
		
		WebElement text=driver.findElement(By.xpath("//span[@class=\"tooltiptext1\"]"));
		String toolTipContent=text.getText();
	
		Assert.assertEquals(toolTipContent, tooltipText, "Pass");
	}

}
