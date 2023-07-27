package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actionsdriver.Action;
import com.base.Base;

public class AddRecipientPage  extends Base{
	
	public AddRecipientPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@value='Add Recipient']")
	WebElement clickOnAddRecip;
	
	@FindBy(id="mob_no")
	WebElement senderNum;
	
	@FindBy(id="name")
	WebElement senderName;
	
	@FindBy(id="beneficiary_name")
	WebElement recipName;
	
	
	@FindBy(id="beneficiary_mob_no")
	WebElement recipNo;
	
	@FindBy(id="account_no")
	WebElement AcNum;
	
	@FindBy(id="confirm_acc_no")
	WebElement confirmAcNo;
	
	@FindBy(xpath="//span[@class='selection']")
	WebElement bankName;
	
	@FindBy(xpath="//option[text()='IDBI BANK']")
	WebElement enterBankName;
	
	@FindBy(xpath="//input[@value='Submit']")
	WebElement subBtn;
	
	@FindBy(xpath="//input[@value='Cancel']")
	WebElement cancelBtn;
	
	@FindBy(xpath="//input[@value='Back']")
	WebElement clickOnBackBtn;
	
	public KycPage addRecipient() throws InterruptedException
	{
		Action.clickFun(clickOnAddRecip);
		Action.enterValue(recipName, prop.getProperty("RecipientName"));
		Action.enterValue(recipNo, prop.getProperty("RecipientNum"));
		Action.enterValue(AcNum, prop.getProperty("AccountNo"));
		Action.enterValue(confirmAcNo, prop.getProperty("ConfirmAccNo"));
		Action.clickFun(bankName);
		Thread.sleep(4000);
		Action.clickFun(enterBankName);
		//enterBankName.sendKeys("IDBIBank");
		Action.clickFun(subBtn);
		return new KycPage();
	
	}


	public KycPage clickBackBtn()
	{
		Action.clickFun(clickOnAddRecip);
		Action.clickFun(clickOnBackBtn);
		return new KycPage();
		
	}
	
	public void cancelBtn() throws InterruptedException
	{
		Action.clickFun(clickOnAddRecip);
		Action.enterValue(recipName, prop.getProperty("RecipientName"));
		Action.enterValue(recipNo, prop.getProperty("RecipientNum"));
		Action.enterValue(AcNum, prop.getProperty("AccountNo"));
		Action.enterValue(confirmAcNo, prop.getProperty("ConfirmAccNo"));
		Action.clickFun(bankName);
		Thread.sleep(4000);
		Action.clickFun(enterBankName);
		//enterBankName.sendKeys("IDBIBank");
		Action.clickFun(cancelBtn);
	}
	
}
