package com.ro.qa.page;

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
	
	@FindBy(xpath="//*[@id=\"83\"]/a")
	WebElement clickOnCard;
	
	@FindBy(xpath="//div[@class='modal-content']//button[@class='close']//span")
	WebElement popupCross;
	
	@FindBy(xpath="//p[@class='welcome_txt pull-right']//strong")
	WebElement verifyAgentName;
	
	@FindBy(xpath="//input[@id='mobile_no']")
	WebElement clickAnyWhere;
	
	@FindBy(xpath="//li[@id='115']//a")
	WebElement clickonDMT;
	
	@FindBy(xpath="//li[@id='113']//a")
	WebElement clickonAremit;
	
	public boolean agname()
	{
		return verifyAgentName.isDisplayed();
	}
	
	public void crossPopup()
	{

		popupCross.click();
	}
	
	public CardPage clickOnCardTest() throws IOException
	{

		clickOnCard.click();
		return new CardPage();
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
