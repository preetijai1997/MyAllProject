package com.ro.qa.Page;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ro.qa.baseclass.TestBase;

public class LoginPage  extends TestBase{
	
	
	
	@FindBy(xpath="//input[@name='userName']")
	WebElement username;
	
	@FindBy(name="pass")
	WebElement password;
	
	@FindBy(id="login")
	WebElement loginBtn;
	
	@FindBy(xpath="//img[@data-rjs-processed='true']")
	WebElement LogoImg;
	
	@FindBy(xpath="//div[@id='popup']/div/div/button/span")
	WebElement popupCross;
	
	
public	LoginPage() throws IOException
	{
		PageFactory.initElements(driver, this);
	}

public String validateTitle()
{
	return driver.getTitle();
}

public boolean ImageValidate()
{
	
	return LogoImg.isDisplayed();
}

public void cutPopup()
{
	popupCross.click();
}

public HomePage login(String un,String pwd) throws IOException
{
	
	username.sendKeys(un);
	password.sendKeys(pwd);
	loginBtn.click();
	return new HomePage();
}
}
	
	


