package com.ro.qa.page;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ro.qa.baseclass.TestBase;

import net.jodah.failsafe.internal.util.Assert;

public class CardLoadPage extends TestBase{

	public CardLoadPage() throws IOException {
		
			PageFactory.initElements(driver, this);
			
		}
		
		@FindBy(xpath="//input[@id='mobileNo']")
		WebElement mobNo;
		
		@FindBy(xpath="//input[@id='cardHolderName']")
		WebElement cardholderName;
		
		//@FindBy(xpath="//option[@value='130']")
		//WebElement cardType;
		
		@FindBy(id="cardTypeName")
		WebElement selectCardType;
		
		@FindBy(xpath="//input[@id='loadAmount']")
		WebElement loadAmt;
		
		@FindBy(xpath="//input[@value='Load Amount']")
		WebElement loadAmountBtn;
		
		@FindBy(id="successMsg")
		WebElement successmsg;
		
		@FindBy(xpath="//p[@class='balance_box']//strong")
		WebElement walletBalance;
		
		public void CardDetails(String num,String amount)
		{
			mobNo.sendKeys(num);
			
			loadAmt.sendKeys(amount);
			selectCardType.click();
			Select s=new Select(selectCardType);
			//s.selectByValue("VIRTUAL CARD");
			 s.selectByValue("130");
			 System.out.println("Before Wallet Balance===="+walletBalance.getText());
			// System.out.println("Transfer amount iloadAmt.sendKeys(prop.getProperty("Amount")));
			 loadAmountBtn.click();
			System.out.println( successmsg.getText());
			 System.out.println("After Wallet Balance===="+walletBalance.getText());	
		     
				
		}
		
		public boolean cardHolderName()
		{
			return cardholderName.isDisplayed();
		}
		
		public boolean cardSuccessMessage()
		{
			return successmsg.isDisplayed();
		}
		
		
		
		/*
		 * public boolean cardType() { return cardType.isSelected(); }
		 */
		
		public void clickOnDropdown()
		{
			selectCardType.click();
		}
		public void selectingCard()
		{
			Select s=new Select(selectCardType);
			//s.selectByValue("VIRTUAL CARD");
			 s.selectByValue("130");
		}
		
		
		
		public void loadAmtBtn()
		{
			loadAmountBtn.click();
		}
		

}
