package com.pageobjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actionsdriver.Action;
import com.base.Base;

public class Aremit extends Base {
	
	public Aremit()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="mobile_no")
	WebElement sendNum;
	
	
	@FindBy(xpath="(//input[@class='form_submit_btn'])[1]")
	WebElement clickOnSubmit;
	
	@FindBy(id="c_name")
	WebElement enterName;
	
	@FindBy(id="c_address")
	WebElement address;
	
	@FindBy(id="c_dob")
	WebElement DateOfBirth;
	
	@FindBy(xpath="//select[@data-handler='selectMonth']")
	WebElement Month;
	
	@FindBy(xpath="//select[@data-handler='selectYear']")
	WebElement Year;
	
	@FindBy(xpath="//td[@data-handler=\"selectDay\"]/a[text()='18']")
	WebElement selectDate;
	
	
	@FindBy(id="otp")
	WebElement enterOTP;
	
	@FindBy(id="resend")
	WebElement resndOTP;
	
	
	@FindBy(xpath="//div[@id='headingShow']//following-sibling::div[2]")
	static WebElement message;
	public KycPage SenderRegistration() throws InterruptedException
	{

		  Action.enterValue(sendNum,prop.getProperty("senderNum"));
		  Action.clickFun(clickOnSubmit);
        

	  boolean isExits=Action.enterValue(address, prop.getProperty("Address"));
	  System.out.println("================= isExsit"+isExits);
	  if(isExits)
	  {
		  System.out.println("=================");
		
	
	    Action.enterValue(enterName, prop.getProperty("NameAsPerPan"));
	  Action.enterValue(address, prop.getProperty("Address"));
	  Action.clickFun(DateOfBirth);
	 
	  Action.clickFun(Year);
	  Action.selectByValue(Year, prop.getProperty("yaer"));
	  Action.clickFun(Month);
	  Action.selectByValue(Month, prop.getProperty("month"));
	  Action.clickFun(selectDate);
	  Action.clickFun(clickOnSubmit);
	 
	  Action.clickFun(resndOTP);
	Thread.sleep(8000);
	  driver.switchTo().alert().accept();
		Thread.sleep(8000);
	  Action.clickFun(enterOTP);
	  Thread.sleep(65);
	 
	  Action.clickFun(clickOnSubmit);

	  }
	
	  return new KycPage();
	}
	
	public   String messageDisplay()
	{
		return message.getText();
	}

}
