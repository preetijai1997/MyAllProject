package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actionsdriver.Action;
import com.base.Base;

public class AccountVerification extends Base  {
	
	private static AccountVerification instance=null;
	
	public AccountVerification()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public static  AccountVerification getInstance()
	{
		if(instance==null)
		{
			instance=new AccountVerification();
		}
		return instance;
		
	}
	@FindBy(xpath="//input[@value='Account Verification']")
	WebElement clickOnAccountVerifdication;

	
	public void clickAccountVerification()
	{
		Action.clickFun(clickOnAccountVerifdication);
	}

}

