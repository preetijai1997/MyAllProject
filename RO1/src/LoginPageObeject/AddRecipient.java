package LoginPageObeject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddRecipient {
	public AddRecipient(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/div[3]/a[2]/input[1]")
	public WebElement clickOnAddRecipient;
	
	@FindBy(id="beneficiary_name")
	public WebElement recipientName;
	
	@FindBy(id="beneficiary_mob_no")
	public WebElement recipientMobNo;
	
	@FindBy(id="account_no")
	public WebElement AcNo;
	
	@FindBy(id="confirm_acc_no")
	public WebElement cAcNo;
	
	@FindBy(id="bankname")
	public WebElement selectBankname;
	
	
	@FindBy(xpath="//body/section[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[7]/input[1]")
	public WebElement sub;
	
	@FindBy(xpath="//body/section[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[7]/input[2]")
	public WebElement btncancel;
	
	@FindBy(xpath="/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[7]/a[1]/input[1]")
	public WebElement btnBack;
	

}
