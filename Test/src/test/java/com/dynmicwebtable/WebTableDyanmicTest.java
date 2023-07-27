package com.dynmicwebtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javaprogram.util.concurrent.TimeUnit;

public class WebTableDyanmicTest {

   static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bs0452\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver= new ChromeDriver();
		 
		// driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
		 driver.get("https://ui.freecrm.com/");
		 
		 Thread.sleep(8000);
		 
		 driver.findElement(By.name("email")).sendKeys("preetijaiswal504@gmail.com");
		 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("India@123");
		 driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
		 
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//*[@id=\"main-nav\"]/div[3]/a")).click();
		 
		// Thread.sleep(5000);
		//*[@id="main-content"]/div/div[2]/div/table/tbody/tr[1]/td[2]
		 
		//*[@id="main-content"]/div/div[2]/div/table/tbody/tr[2]/td[2]
	//	String before_xpath= "//*[@id='main-content']/div/div[2]/div/table/tbody/tr[";
	//	String after_xpath="]/td[2]/a";
        		
		/*
		 * Method-=1
		
		 for(int i=1;i<=2;i++)
		 {
			String name= driver.findElement(By.xpath(before_xpath+ i +after_xpath)).getText();
			System.out.println(name);
			
			//*[@id="main-content"]/div/div[2]/div/table/tbody/tr[2]/td[1]
			
			if(name.equals("preetitest1 jaiswal"))
			{
	  WebElement checkBox=driver.findElement(By.xpath("//*[@id=\'main-content\']/div/div[2]/div/table/tbody/tr["+ i +"]/td[1]" ));
		Thread.sleep(3000);
	  checkBox.click();
			}
			 
		 }
*/
		
		//Method-2
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[contains(text(),'preetitest1 jaiswal')]/parent::td//preceding-sibling::td//div[@class='ui fitted read-only checkbox']")).click();
	}

}
