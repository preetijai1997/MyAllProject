package LoginPageExecute;

import java.sql.Date;
import java.text.SimpleDateFormat;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import LoginPageObeject.AccoumtVerfication;
import LoginPageObeject.AddRecipient;
import LoginPageObeject.DMT;
import LoginPageObeject.PayNow;
import LoginPageObeject.ROLoginPage;
import LoginPageObeject.RefundTransaction;

public class LoginPageTestCase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bs0452\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://uat.bankit.in/RO1/");
		Thread.sleep(3000);
		driver.switchTo().frame("Main");
		driver.manage().window().maximize();
		//driver.switchTo().defaultContent();

		 ROLoginPage loginPage=new ROLoginPage(driver);
		
		
		loginPage.txtUdserName.sendKeys("shobhit.rai@bankit.in");
		loginPage.txtUserPass.sendKeys("Amit@123");
		loginPage.btnLogin.click();
		//loginPage.clickSignUp.click();
		Thread.sleep(3000);
		loginPage.cutonCross.click();
		
		DMT dm=new DMT(driver);
		dm.clickOnDMT.click();
		Thread.sleep(3000);
		dm.clickOnAremit.click();
		
		dm.txtMobNo.sendKeys("8957181611");
		
		//dm.btnCancel.click();
		
		dm.btnSubmit.click();
		
		PayNow pn=new PayNow(driver);
		pn.btnPayNow.click();
		pn.txtAmt.sendKeys("200");
		pn.BankitFess.sendKeys("3");
		pn.textTA.click();
		pn.textRemark.sendKeys("Payment");
		pn.btnSelect.click();
		pn.btnPay.click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		Thread.sleep(8000);
		//pn.btnBack.click();
		pn.btnprint.click();
   //pn.btnBack.click();
		//driver.findElement(By.id("print")).click();
		/*

		pn.btnPrint.click();
	
		/*
dm.nameAsPerPan.sendKeys("POOJA YADAV");
		
		dm.add.sendKeys("Gorakhpur");
		
		dm.dob.click();
		
		dm.clickDate.click();
		
		dm.btnSub.click();
		
		//dm.clickResend.click();
		Thread.sleep(3000);
		
		dm.otpFill.sendKeys("424820");
		dm.btnSubmitt.click();
		/*
		Thread.sleep(3000);
		Alert alert=driver.switchTo().alert();
		alert.accept();
		*/
	
		//dm.btnclear.click();
		//dm.buttonSubmit.click();
		/*
		
		RefundTransaction rt=new RefundTransaction(driver);
		rt.btnRefund.click();
		
		rt.TranId.sendKeys("123456789");
		rt.linkResOTP.click();
		//Thread.sleep(2000);
		rt.btnBack.click();
		
		
	
		AccoumtVerfication av=new AccoumtVerfication(driver);
		av.account_verification.click();
		
		Thread.sleep(5000);
		av.accountNo.sendKeys("0035104000177788");
		WebElement staticDropdown=driver.findElement(By.id("bankname"));
		Select dropdown=new Select(staticDropdown);
		dropdown.selectByVisibleText("UNION BANK OF INDIA");
		Thread.sleep(1000);
		av.btnSubmit.click();
		//av.btnBack.click();
		/*
		AddRecipient ar=new AddRecipient(driver);
		ar.clickOnAddRecipient.click();
		
		ar.recipientName.sendKeys("Vinod");
		ar.recipientMobNo.sendKeys("7612657895");
		ar.AcNo.sendKeys("34214567896677");
		ar.cAcNo.sendKeys("34214567896677");
		
		ar.selectBankname.click();
		
	WebElement staticDropdown=driver.findElement(By.id("bankname"));
	Select dropdown=new Select(staticDropdown);
	dropdown.selectByVisibleText("UNION BANK OF INDIA");
	Thread.sleep(1000);
	//ar.sub.click();
	Thread.sleep(4000);
	//ar.btnBack.click();
	ar.btncancel.click();
	
	//ar.btnBack.click();
		/*String number=dm.checkMobNo.getText();
	
		
		System.out.println(number);
		
		
		
		
		/*
		WebElement staticDropdown=driver.findElement(By.name("c_dob"));
		
		Select dropdown=new Select(staticDropdown);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		
		driver.findElement(By.className("particularsText hasDatepicker")).click();
		
		String setDateStr="2003-12-11";
	String cyrrentDate=	driver.findElement(By.className("ui-datepicker-title")).getText();
	
	//Date setDate=(Date) new SimpleDateFormat(pattern:"yyyy-mm-dd").parse(setDateStr);
		
*/
	}

}
