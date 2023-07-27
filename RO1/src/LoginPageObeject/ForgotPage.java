package LoginPageObeject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPage {
	
	public ForgotPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver,this);
	}
	   @FindBy(linkText="Forgot Password?")
	   public WebElement clickForgotPass;
	@FindBy(name="EmailID")
	public WebElement txtEmail;
	
	@FindBy(linkText="Submit")
	public WebElement btnSubmit;
	
	@FindBy(id="otp")
	public WebElement enterOTP;
	
	
	@FindBy(linkText="Submit")
	public WebElement btnSubmit1;

}
