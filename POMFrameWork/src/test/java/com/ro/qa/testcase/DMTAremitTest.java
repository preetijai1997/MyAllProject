package com.ro.qa.testcase;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ro.qa.baseclass.TestBase;
import com.ro.qa.page.CardLoadPage;
import com.ro.qa.page.DMTAREMITPage;
import com.ro.qa.page.HomePage;
import com.ro.qa.page.LoginPage;
import com.ro.qa.utility.TestUtil;

public class DMTAremitTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	TestUtil testutil;
	String sheetName="InitaeTransaction";
	DMTAREMITPage aremit;
	CardLoadPage cardloadpage;
	public DMTAremitTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	@BeforeMethod()
	public void setUp() throws IOException
	{
		initialization();
		testutil=new TestUtil();
		loginpage=new LoginPage();
		aremit=new DMTAREMITPage();
		testutil.swtichToFrame();
		homepage= loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		//loginpage.cutPopup();
	
		//testutil.swtichToFrame();
		aremit=homepage.clickOnDMT();
		
		
		}
	
	@DataProvider
	public Object[][] getDMTTest() throws IOException
	{
		Object data[][]=TestUtil.getTestData(sheetName);
		return data;
	}
	
	@Test(dataProvider="getDMTTest")
	public void AremitTransaction(String MobileNumber, String TransferAmount,String Remarks )
	{
		homepage.clickOnAremit();
		//aremit.AremitTransactionInfo("8957181611", "5000", "Test Remark");
		//aremit.AremitTransactionInfo(MobileNumber,TransferAmount, Remarks);
		//aremit.AremitTransactionInfo("8957181611", "6000", "Testing");
		aremit.AremitTransactionInfo(MobileNumber, TransferAmount, Remarks);
		
	}
	{
		
	}

}
