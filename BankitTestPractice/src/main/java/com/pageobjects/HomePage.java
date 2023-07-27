package com.pageobjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actionsdriver.Action;
import com.base.Base;

public class HomePage extends Base{
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@id='popup']/div/div/button")
	WebElement clickOnCross;
	
	
	@FindBy(xpath="//a[text()='DMT']")
	WebElement clickOnDmt;
	
	@FindBy(xpath="//ul[@class=\"dropdown-menu\"]/li/a[text()='AREMIT']")
	WebElement aremit;
	
	
	public void crossPopUp()
	{
		Action.explicitWait(driver,clickOnCross,Duration.ofSeconds(3));
		Action.clickFun(clickOnCross);
	}
	
	
	public void clickOnDMT()
	{
		Action.clickFun(clickOnDmt);
	}
	
	
	public Aremit clickOnAremit()
	{
		Action.clickFun(aremit);
		return new Aremit();
	}
	
	
}
