package LoginPageObeject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DMT {
	
	public DMT(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(linkText="DMT")
	public WebElement clickOnDMT;
	
	//@FindBy(id="113")
	
	//@FindBy(xpath="//*[@id='113']/a")
	@FindBy(linkText="AREMIT")
	public WebElement clickOnAremit;
	
	
	@FindBy(id="mobile_no")
	public WebElement txtMobNo;

	@FindBy(css="[value='Clear']")
	public WebElement btnCancel;
	
	@FindBy(css="[value='Submit']")
	public WebElement btnSubmit;
	
	
	@FindBy(className="particularsText")
	public WebElement checkMobNo;
	
	@FindBy(name="c_name")
	public WebElement nameAsPerPan;
	
	@FindBy(name="c_address")
	public WebElement add;
	
	@FindBy(name="c_dob")
	public WebElement dob;
	
	@FindBy(xpath="//a[contains(text(),'11')]")
	public WebElement clickDate;
	
	
	@FindBy(className="form_submit_btn")
	public WebElement btnclear;
	
	@FindBy(xpath="html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/table[1]/tbody[1]/tr[5]/td[2]/input[1]")
	public WebElement btnSub;
	
	//@FindBy(id="resend")
	//public WebElement clickResend;

@FindBy(id="otp")
public WebElement otpFill;
	
@FindBy(css="section.main_space:nth-child(9) div.container:nth-child(1) div.col-md-12.tog_box div.middleBox.bgcolor div.heading_tabs.utility_tbs:nth-child(1) table.particulars tbody:nth-child(1) tr.separator:nth-child(6) td:nth-child(2) > input.form_submit_btn")
public WebElement btnSubmitt;
	
	


	
	
	
	
	
		
	}
	
	

