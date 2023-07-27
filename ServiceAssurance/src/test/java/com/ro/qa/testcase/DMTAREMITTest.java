package com.ro.qa.testcase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ro.qa.baseclass.TestBase;

import com.ro.qa.Page.DMTAREMITPage;
import com.ro.qa.Page.HomePage;
import com.ro.qa.Page.LoginPage;
import com.ro.qa.testutility.TestUtility;

public class DMTAREMITTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	TestUtility testutil;
	String sheetName="InitaeTransaction";
	DMTAREMITPage aremit;
	
	public DMTAREMITTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	@BeforeMethod()
	public void setUp() throws IOException
	{
		initialization();
		testutil=new TestUtility();
		loginpage=new LoginPage();
		aremit=new DMTAREMITPage();
		testutil.swtichToFrame();
		homepage= loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		loginpage.cutPopup();
	
		//testutil.swtichToFrame();
		aremit=homepage.clickOnDMT();
		
		
		}
	/*
	@DataProvider
	public Object[][] getDMTTest() throws IOException
	{
		Object data[][]=TestUtility.getTestData(sheetName);
		return data;
	}
	*/
	@Test(priority=1)
	public void AremitTransaction() throws InterruptedException, IOException
	{
		homepage.clickOnAremit();
		//aremit.AremitTransactionInfo("8957181611", "5000", "Test Remark");
		//aremit.AremitTransactionInfo(MobileNumber,TransferAmount, Remarks);
		//aremit.AremitTransactionInfo("8957181611", "6000", "Testing");
		aremit.AremitTransactionInfo("8957181611", "6000", "Testing");
		String totalAmount=	aremit.verifyTotAmt();
		System.out.println("Total amount is===="+totalAmount);
		//System.out.println();
		System.out.println(aremit.verifyAmount());
	}
	
	@Test(priority=2)
	public void verifyTotAmount() throws InterruptedException, IOException
	{
		homepage.clickOnAremit();
		aremit.AremitTransactionInfo("8957181611", "6000", "Testing");
		
		aremit.verifyTotalamtRemmove();
	}
	
//	@Test(priority=2)
//	public void verifyTotalAmount() throws InterruptedException
//	{
//		homepage.clickOnAremit();
//		aremit.AremitTransactionInfo("8957181611", "6000", "Testing");
//	String totalAmount=	aremit.verifyTotAmt();
//	System.out.println("Total amount is===="+totalAmount);
//	//Assert.assertEquals(totalAmount, "");
//	}
	
//	

}
