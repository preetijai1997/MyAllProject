package LoginPageObeject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RefundTransaction {

	public RefundTransaction(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="rftran")
	public WebElement btnRefund;
	
	@FindBy(id="tran_id")
	public WebElement TranId;
	
	@FindBy(xpath="//a[contains(text(),'Resend OTP')]")
	public WebElement linkResOTP;
	
	@FindBy(xpath="/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/div[2]/form[1]/table[1]/tbody[1]/tr[3]/td[1]/a[1]/input[1]")
	public WebElement btnBack;
}
