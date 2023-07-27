package com.testcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.actionsdriver.Action;
import com.base.Base;
import com.pageobjects.AccountVerification;
import com.pageobjects.AddRecipientPage;
import com.pageobjects.Aremit;
import com.pageobjects.HomePage;
import com.pageobjects.KycPage;
import com.pageobjects.LoginPage;

public class AremitTestRunner  extends Base{
	
	HomePage hp;
	LoginPage lp;
	Aremit ar;
	KycPage kp;
	AddRecipientPage addRecipient;
	
	@BeforeMethod
	public void setUp()
	{
	launchBrowser();
	driver.get(prop.getProperty("url"));
	Action.fullScreen(driver);
	}
	@AfterMethod
	public void tearDown()
	{
		//driver.quit();
	}
	
	
	@Test
	public void AremitSenderReg() throws InterruptedException
	{
		 lp= new LoginPage(driver);
		 
		lp.signIn();
		 hp= new HomePage();
		 hp.crossPopUp();
		 hp.clickOnDMT();
		hp.clickOnAremit();
		  ar= new Aremit();
		 ar.SenderRegistration();
		String verifyMessage= ar.messageDisplay();
		
		 System.out.println(verifyMessage+ "verify" );
		 kp= new KycPage();
		 kp.landOnKyc();
	}
	
	@Test
	public void addRecip() throws InterruptedException
	{
		lp= new LoginPage(driver);
		 
		lp.signIn();
		 hp= new HomePage();
		 hp.crossPopUp();
		 hp.clickOnDMT();
		hp.clickOnAremit();
		  ar= new Aremit();
		 ar.SenderRegistration();
		String verifyMessage= ar.messageDisplay();
		
		 System.out.println(verifyMessage );
		 kp= new KycPage();
		 kp.landOnKyc();
		 
		 addRecipient= new AddRecipientPage();
		// kp=addRecipient.addRecipient();
		// kp=addRecipient.clickBackBtn();
		addRecipient.cancelBtn();
	
		AccountVerification  accVerification=	AccountVerification.getInstance();
		
		 
	}
	

	
	
	

}
