package com.actionsdriver;


import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.Base;

public class Action  extends Base{
	
	
  public void click(WebElement ele, WebDriver driver)
  {
	  Actions ac= new Actions(driver);
	  ac.moveToElement(ele).build().perform();
  }
  
  public static boolean findElement(WebDriver driver, WebElement ele)
  {
	  boolean flag= false;
	  try
	  {
	  ele.isDisplayed();
	  flag=true;
	  
	  }
	  catch(Exception e)
	  {
		 flag=false;
	  }
	  finally
	  {
		  if(flag)
		  {
			  System.out.println("Element is present" + ele);
		  }
		  else
		  {
			  System.out.println("Element is not present");
		  }
		  
	  }
	return flag;
	  
  }
  
  public static boolean isDisplayed(WebDriver driver, WebElement ele)
  {
	  boolean flag=false;
	  flag=findElement(driver, ele);
	  
	  try
	  {
		  ele.isDisplayed();
		  flag= true;
	  }
	  catch(Exception e)
	  {
		 e.printStackTrace();
		 flag=false;
	  }
	  
	  finally
	  {
		if(flag)
		{
			System.out.println("Element is displayed" + ele);
		}
		else
		{
			System.out.println("Element is not displayed");
		}
		  
	  }
	return flag;
  }
  
  public boolean isEnabled(WebDriver driver, WebElement ele)
  {
	  boolean flag= false;
	  flag= findElement(driver, ele);
	  try
	  {
		  ele.isEnabled();
		  flag= true;
		  
	  }
	  catch(Exception e)
	  {
		  flag= false;
	  }
	  finally
	  {
		  if(flag)
		  {
			  System.out.println("Element is enable");
		  }
		  else
		  {
			  System.out.println("Element is not enable");
		  }
	  }
	return flag;
  }
  
  
  public static boolean enterValue(WebElement ele, String text)
  {
	  boolean flag= false;
	  try
	  {
		 flag= ele.isDisplayed();
		  ele.sendKeys(text);
		 
	  }
	  catch(Exception e)
	  {
		 // e.printStackTrace();
		  flag=false;
	  }
	  
	  finally
	  
	  {
		  if(flag)
		  {
			  System.out.println("Successfully enter value " + text);
		  }
		  else
		  {
			  System.out.println("value not enter successfully " + text);
		  }
	  }
	return flag;
  }
  

  public static boolean switchToFrameByName(WebDriver driver, String name)
  {
	  boolean flag=false;
	  
	  try
	  {
		  driver.switchTo().frame(name);
		  flag=true;
		  return true;
	  }
	  catch(Exception e)
	  {
		  e.printStackTrace();
	  }
	  
	  finally
	  {
		  if(flag)
		  {
			  System.out.println("Successfully switch to frame");
		  }
		  else
		  {
			  System.out.println("Not Successfully switch to frame");
		  }
	  }
	return flag;
  }
  
  
  public boolean switchToFrameById(WebDriver driver, String id)
  {
	  boolean flag= false;
	  
	  try
	  {
		  driver.switchTo().frame(id);
		  return true;
	  }
	  catch(Exception e)
	  {
		  e.printStackTrace();
	  }
	  finally
	  {
		  if(flag)
		  {
			  System.out.println("Successfully switch to  frame "+ id);
		  }
		  else
		  {
			  System.out.println("Not switch to frame "+ id);
		  }
	  }
	return flag;
  }
  
  public void mouseOverElement(WebDriver driver, WebElement ele)
  {
	  boolean flag= false;
	  try
	  {
		  Actions ac= new Actions(driver);
		ac.moveToElement(ele).build().perform();
		flag=true;
	  }
	  
	  catch(Exception e)
	  {
		  e.printStackTrace();
	  }
	  finally
	  {
		  if(flag)
		  {
			  System.out.println("MouserOver Action is performed on");
		  }
		  else
		  {
			  System.out.println("MouseOver action is not performed on");
		  }
	  }

	 
	  
  }
  
  
  
 public boolean rightClick(WebDriver driver, WebElement ele)
 {
	 boolean flag= false;
	 
	 try
	 {
		 
		 Actions a= new Actions(driver);
		 a.contextClick(ele).build().perform();
		 flag= true;
		 return true;
	 }
	 catch(Exception e)
	 {
		 e.printStackTrace();
	 }
	 
	 
	 finally
	 {
		 if(flag)
		 {
			 System.out.println("successfully right click on element : "+ ele);
		 }
		 else
		 {
			 System.out.println("Not right click on element : "+ ele);
		 }
	 }
	return flag;
 }
 
 public static void implicitWait(WebDriver driver, int timeOut)
 {
	 driver.manage().timeouts().implicitlyWait(timeOut, TimeUnit.SECONDS);
 
 }
 
 public static void explicitWait(WebDriver driver, WebElement ele, Duration timeOut)
 {
	 WebDriverWait wait = new WebDriverWait(driver,timeOut);
	 wait.until(ExpectedConditions.visibilityOf(ele));
	 
 }
 
 
 public static void clickFun(WebElement ele)
 {
	 ele.click();
	 System.out.println("Successfully click on button : " + ele);
 }
 
 public static void fullScreen(WebDriver driver)
 {
	 driver.manage().window().maximize();
 }
 

 
 public static boolean selectByValue(WebElement ele, String value)
 {
	boolean flag=false;
	 
	try
	 {
	 Select s= new Select(ele);
	 s.selectByValue(value);
	 flag= true;
	 return true;
	 }
	catch(Exception e)
	{
		e.printStackTrace();
		
	}
	finally
	{
		if(flag)
		{
			System.out.println("Select the value from dropdown : "+ value);
		}
		else
		{
			System.out.println("Not successfully select value from dropdown : "+ value);
		}
	}
	return flag;
	 
 }
 
 


}
