package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Guru99LoginPageObject {
	
	/*public Guru99LoginPageObject(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}*/
	
	public Guru99LoginPageObject(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver,this);
	}
	

	@FindBy(name="uid")
	public WebElement txtUserId;
	
    @FindBy(name="password")
    public WebElement txtPass;
    
    @FindBy(name="btnLogin")
    public WebElement btnLogin;
    
    
    @FindBy(name="btnReset")
    public WebElement btnReset;


    
}
