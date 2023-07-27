package com.ro.qa.hashmapconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AgentPortalTest {
static WebDriver driver;
public String agentCredentials;
public String[] a1;

@BeforeMethod
public void setup()
{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\bs0452\\Downloads\\chromedriver_win32\\chromedriver.exe");
			 driver= new ChromeDriver();
			 driver.manage().window().maximize();
			driver.get("https://uat.bankit.in/RO1/");
}

@Test(priority=1)
public void checkCredential() throws InterruptedException
{
			driver.switchTo().frame("Main");
		 agentCredentials=TestHashMapConcept.AgentPortal().get("agent");
		 a1=agentCredentials.split("_");
		driver.findElement(By.name("userName")).sendKeys(a1[0]);
		driver.findElement(By.id("password")).sendKeys(a1[1]);
		
		driver.findElement(By.id("login")).click();
		Thread.sleep(8000);
		
		driver.findElement(By.xpath("//*[@id=\"popup\"]/div/div/button/span")).click();
}
/*
@Test(priority=2)
public void cutPopup()
{
	
}
	*/	
			
	}


