package com.pageobjects;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actionsdriver.Action;
import com.base.Base;

public class LoginPage extends Base {
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//img[@data-rjs='2']")
	WebElement ROLogo;
	
	
	
	@FindBy(name="userName")
	WebElement username;
	
	@FindBy(id="password")
	WebElement pass;
	
	@FindBy(id="login")
	WebElement loginBtn;
	
	
	public boolean checkLogo()
	{
		Action.switchToFrameByName(driver,prop.getProperty("frameName"));
          return Action.isDisplayed(driver,ROLogo);
	     //System.out.println("Logo is present on screen : "+ isPresent);
	     
	}
	
	public HomePage signIn() throws InterruptedException
	{
		//Action.implicitWait(driver,4);
		Action.switchToFrameByName(driver,prop.getProperty("frameName"));
		//Action.switchToFrameByName(driver,prop.getProperty("frameName"));
		Action.isDisplayed(driver, username);
		Action.enterValue(username,prop.getProperty("username"));
		//Thread.sleep(5000);
		Action.isDisplayed(driver, pass);
		Action.enterValue(pass,prop.getProperty("password"));
		//Action.isDisplayed(driver, loginBtn);
		Action.clickFun(loginBtn);
		return new HomePage();
		
		
		
	}
	

}
