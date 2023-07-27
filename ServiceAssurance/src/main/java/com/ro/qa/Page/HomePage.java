package com.ro.qa.Page;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ro.qa.baseclass.TestBase;

public class HomePage extends TestBase {

	public HomePage() throws IOException {
		
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	@FindBy(xpath="//p[@class='welcome_txt pull-right']//strong")
	WebElement verifyAgentName;
	
	@FindBy(xpath="//input[@id='mobile_no']")
	WebElement clickAnyWhere;
	
	@FindBy(xpath="//div[@id='head_menu']/ul/li[3]/a")
	WebElement clickonDMT;
	
	@FindBy(xpath="//div[@id='head_menu']/ul/li[3]/ul/li/a[contains(text(),'AREMIT')]")
	WebElement clickonAremit;
	
	public boolean agname()
	{
		return verifyAgentName.isDisplayed();
	}
	 
	
	
	
	public void clickOnpage()
	{
		clickAnyWhere.click();
	}
	
	public String verifyTitle()
	{
		return driver.getTitle();
	}
	
	public DMTAREMITPage clickOnDMT() throws IOException
	{
		clickonDMT.click();
		return new DMTAREMITPage();
	}
	public void clickOnAremit()
	{
		Actions action=new Actions(driver);
		action.moveToElement(clickonDMT).build().perform();
		clickonAremit.click();
	}
	

}
