package com.ro.qa.Page;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ro.qa.baseclass.TestBase;

public class DMTAREMITPage extends TestBase{

	public DMTAREMITPage() throws IOException {
		PageFactory.initElements(driver, this);
		
	}
	public WebElement amt;
	@FindBy(id="mobile_no")
	WebElement mobnum;
	
	@FindBy(xpath="//input[@value='Submit']")
	WebElement clickOnSubBtn;
	
	@FindBy(id="payifsc2")
	WebElement clickOnPayNow;
	
	@FindBy(xpath="//input[@onchange='gettotalamount();' and @id='amount']")
	public static WebElement amount;
	
	
	@FindBy(xpath="//input[@id='tamt']")
	static
	WebElement totalamount;
	
	@FindBy(id="remark")
	WebElement remaks;
	
	
	@FindBy(xpath="//input[@id='img_btn' and @value='Pay Now']")
	WebElement clickonPayNowBTN;
	
	@FindBy(xpath="//p[@class='balance_box']//strong")
	WebElement walletBalance;
	
	
	@FindBy(xpath="//img[@alt='Secure Plus']")
	WebElement securePlusLogo;
	
	public void AremitTransactionInfo(String mobno, String amt, String Remarks) throws InterruptedException, IOException
	{
		
		mobnum.sendKeys(mobno);
		clickOnSubBtn.click();
		clickOnPayNow.click();
		amount.sendKeys(amt);
		remaks.sendKeys(Remarks);
		System.out.println("Before Wallet Balance===="+walletBalance.getText());
		Thread.sleep(3000);
		System.out.println(amount.getText());
		System.out.println(totalamount.getText());
		securePlusLogo.click();
		
		URL url=new URL("C:\\Users\\bs0452\\Downloads\\Service Assurance.pdf");
		InputStream is=url.openStream();
		
		BufferedInputStream bis=new BufferedInputStream(is);
		
		PDDocument doc=null;
	doc=PDDocument.load(bis);
	String pdfContent=new PDFTextStripper().getText(doc);
	System.out.println(pdfContent);
	
		
		
		
		
		//amount.clear();
//		Alert alert1= driver.switchTo().alert();
//		 alert1.accept();
	}
	
	public String  verifyTotAmt()
	{
		
		return totalamount.getText();
	}
	
	public String verifyAmount()
	{
		return amount.getText();
	}
	
	public static void verifyTotalamtRemmove()
	{
       amount.clear();
      
       Alert alert1= driver.switchTo().alert();
       alert1.accept();
		if(amount.equals(null) || amount.equals(0))
		{
			totalamount=null;
		}
		 System.out.println(amount.getText());
			System.out.println(totalamount.getText());
	}
	
	
//	}	 
//	 }
		 
//		 Thread.sleep(2000);
//		Alert alert1= driver.switchTo().alert();
//		 alert1.accept();
//		 amount.sendKeys("2000");
//		 System.out.println("Total Amount is======"+totalamount.getText()); 
//		 clickonPayNowBTN.click();
//		 
//		 
//		Alert alert= driver.switchTo().alert();
//	    alert.accept();
//		System.out.println("After Wallet Balance===="+walletBalance.getText());
//		
		



}
	


