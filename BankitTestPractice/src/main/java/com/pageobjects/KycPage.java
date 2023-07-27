package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class KycPage extends Base {
	
	@FindBy(xpath="//td[text()='Monthly Limit :']")
	WebElement monthLimit;
	
	
	public KycPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String landOnKyc()
	{
		return monthLimit.getText();
	}
	
	

}
