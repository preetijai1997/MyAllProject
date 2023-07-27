package com.roportal;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javaprogram.net.HttpURLConnection;
import javaprogram.net.MalformedURLException;
import javaprogram.net.URL;
import javaprogram.util.ArrayList;
import javaprogram.util.List;
import javaprogram.util.concurrent.TimeUnit;

public class RoPortalBrokenLinks {

	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bs0452\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://uat.bankit.in/RO/");
		driver.manage().window().maximize();
		driver.switchTo().frame("Main");
		        //UserName
				WebElement username1=driver.findElement(By.name("userName"));
			    username1.clear();
			    username1.sendKeys("shobhit.rai@bankit.in");
			    
			    //Password
			    WebElement password1=driver.findElement(By.id("password"));
			    password1.clear();
			    password1.sendKeys("Amit@123");
			    
				//Login
			    WebElement loginbtnClick=  driver.findElement(By.id("login"));
			    loginbtnClick.click();
			  
			    //Popup Banner
			    Thread.sleep(2000);
			     driver.findElement(By.xpath("//*[@id=\"popup\"]/div/div/button/span")).click();
			     
			  List<WebElement> li=  driver.findElements(By.tagName("a"));
			  li.addAll(driver.findElements(By.tagName("img")));
			  
			  System.out.println("Total links and img in the page===="+li.size());
			  
			  List<WebElement> activeLinks=new ArrayList<WebElement>();
			  
			  for(int i=0;i<li.size();i++)
			  {
				  if(li.get(i).getAttribute("href")!=null  && (!li.get(i).getAttribute("href").contains("javascript")))
				  {
					  activeLinks.add(li.get(i));
				  }
				  
			  }
			  
			  System.out.println("Total Active Links==="+activeLinks.size());
			  
			  for(int j=0;j<activeLinks.size();j++)
			  {
				  HttpURLConnection connection=(HttpURLConnection)new URL(activeLinks.get(j).getAttribute("href")).openConnection();
			  connection.connect();
			
			 String res=  connection.getResponseMessage();
			  
			  connection.disconnect();
			  System.out.println(activeLinks.get(j).getAttribute("href")+"===>"+res);
			  }
			  }

	}


