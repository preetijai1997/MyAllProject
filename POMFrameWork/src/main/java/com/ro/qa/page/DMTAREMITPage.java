package com.ro.qa.page;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ro.qa.baseclass.TestBase;

public class DMTAREMITPage extends TestBase{


	public DMTAREMITPage() throws IOException {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="mobile_no")
	WebElement mobnum;
	
	@FindBy(xpath="//input[@value='Submit']")
	WebElement clickOnSubBtn;
	
	@FindBy(id="payifsc1")
	WebElement clickOnPayNow;
	
	@FindBy(xpath="//input[@id='amount']")
	WebElement amount;
	
	
	@FindBy(id="tamt")
	WebElement totalamount;
	
	@FindBy(id="remark")
	WebElement remaks;
	
	@FindBy(id="img_btn")
	WebElement clickonPayNow;
	
	@FindBy(xpath="//p[@class='balance_box']//strong")
	WebElement walletBalance;
	public void AremitTransactionInfo(String mobno, String amt, String Remarks)
	{
		
		mobnum.sendKeys(mobno);
		clickOnSubBtn.click();
		clickOnPayNow.click();
		amount.sendKeys(amt);
		remaks.sendKeys(Remarks);
		

			System.out.println("Before Wallet Balance===="+walletBalance.getText());
		 clickonPayNow.click();
		 
		Alert alert= driver.switchTo().alert();
	    alert.accept();
		System.out.println("After Wallet Balance===="+walletBalance.getText());
		}
	

}
