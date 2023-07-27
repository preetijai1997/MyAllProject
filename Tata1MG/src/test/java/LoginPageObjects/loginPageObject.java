package LoginPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPageObject {
	
	public loginPageObject(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[text()='Login']")
	public WebElement clickOnLogin;
	
	@FindBy(xpath="//input[@class='style__input___3NmkT']")
	public WebElement enterPhoneNum;
	
	@FindBy(xpath="//span[text()='SEND OTP']")
	public WebElement clickOnLoginbtn;
	
	@FindBy(xpath="//input[@class='style__input___3NmkT']")
	public WebElement enterOTP;
	
	@FindBy(xpath="//*[@id=\"body-container\"]/div/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[1]/a")
	public WebElement clickOnDoneBtn;
	
	public void loginDetails(String num) throws InterruptedException
	{
		Thread.sleep(3000);
		clickOnLogin.click();
		enterPhoneNum.sendKeys(num);
		Thread.sleep(2000);
		clickOnLoginbtn.click();
		Thread.sleep(4000);
		enterOTP.click();
		Thread.sleep(27000);
		clickOnDoneBtn.click();
	}
	

}
