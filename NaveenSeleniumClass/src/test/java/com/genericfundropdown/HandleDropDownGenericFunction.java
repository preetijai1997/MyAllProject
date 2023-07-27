package com.genericfundropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDownGenericFunction {

	
static	WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bs0452\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 driver= new ChromeDriver();
		 driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		By Products=By.id("first");
	By animals=	By.id("animals");
	SelectDropdown(Products,"index","3");
	SelectDropdown(animals,"value","Baby cat");
	
	
	}
	public static void SelectDropdown(By locator, String type, String value)
	{
		Select select=new Select(getElement(locator));
		
		switch(type)
		{
		case "index":
			select.selectByIndex(Integer.parseInt(value));
			break;
			
		case "value":
			select.selectByValue(value);
			break;
			
		case "visibleText":
			select.deselectByVisibleText(value);
			break;
		default:
			System.out.println("Please select correct type");
			break;
		}
		
		
	}
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}

}
