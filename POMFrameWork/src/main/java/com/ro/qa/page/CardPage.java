package com.ro.qa.page;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ro.qa.baseclass.TestBase;

public class CardPage extends TestBase {

	public CardPage() throws IOException {
		PageFactory.initElements(driver, this);
		
		
	}
	
	@FindBy(xpath="//a[@id='rftran']")
	WebElement regisPage;
	
	@FindBy(xpath="//input[@value='Card Load']")
	WebElement cardLoadPage;
	
	public RegistraionPage RegistrationIssuancePage() throws IOException
	{
		regisPage.click();
		return new RegistraionPage();
	}
	
	public CardLoadPage CardloadPage() throws IOException
	{
		cardLoadPage.click();
		return new CardLoadPage();
	}
	
	
	
			

}
