package LoginPageObeject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccoumtVerfication {
	public AccoumtVerfication(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="acc_info")
	public WebElement account_verification;
	
	@FindBy(id="acc_no")
	public WebElement accountNo;
	
	@FindBy(xpath="//tbody/tr[4]/td[3]/input[1]")
	public WebElement btnSubmit;
	
	@FindBy(xpath="//tbody/tr[4]/td[3]/a[1]/input[1]")
	public WebElement btnBack;
}
