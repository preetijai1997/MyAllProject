package testcase;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import base.TestBase;



public class RentPaymentClass extends TestBase {
	
	

	@Test(priority=3)
	public void rentPayment(String RentType, String contactNo, String holderName, String bankAcNo, String confirmBankAcNo, String bankName, String ifscCode, String Btn) throws InterruptedException
	{
		
		click("RentPayment_XPATH");
		select("RentType_XPATH", RentType);
		type("ContactNum_ID",contactNo);
		type("HolderName_ID",holderName);
		type("AccountNum_ID",bankAcNo);
		type("ConfirmAccountNo_ID",confirmBankAcNo);
		Thread.sleep(5000);
		click("BankNameClick_XPATH");
		//type("BankName_XPATH",bankName);
		click("RegisterBtn_ID");
		
		
	}




}
