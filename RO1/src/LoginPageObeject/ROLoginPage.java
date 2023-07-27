package LoginPageObeject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ROLoginPage {
	

	
	


	public ROLoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver,this);
	}

	@FindBy(name="userName")
	public WebElement txtUdserName;
	
	@FindBy(name="pass")
	public WebElement txtUserPass;
	
	@FindBy(id="login")
	public WebElement btnLogin;
	

   @FindBy(linkText="Sign Up")
   public WebElement clickSignUp;
   
	
	@FindBy(css="body.modal-open:nth-child(2) section.main_space:nth-child(9) div.modal.fade.in:nth-child(3) div.modal-dialog.modal-lg div.modal-content.pA10 > button.close:nth-child(1)")
	public WebElement cutonCross;





	
	

}
