package signUpPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
	
	public SignUpPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='style__close-icon___3FflV']")
	public WebElement clickOnCross;
	
	@FindBy(xpath="//div[@class='UpdateCityModal__cancel-btn___2jWwS UpdateCityModal__btn___oMW5n']")
	public WebElement clickoNCancel;
	
	
	@FindBy(xpath="//span[text()='Sign Up']")
	public WebElement clcikOnSignUp;
	
	@FindBy(xpath="//input[@class='style__input___3NmkT']")
	public WebElement mobNo;
	
	@FindBy(xpath="//div[@class='style__checkbox-wrapper___1Ffh0']")
	public WebElement checkBox;
	
	@FindBy(xpath="//a[@class='button-text']")
	public WebElement clickOnContinue;
	
	
	@FindBy(xpath="//input[@class='style__input___3NmkT']")
	public WebElement enterOTP;
	
	@FindBy(xpath="//*[@id=\"login-signup-modal--react\"]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[1]")
	public WebElement clickOnDoneBtn;
	
	@FindBy(xpath="//input[@class='style__input___3NmkT']")
	public WebElement emailID;
	
	@FindBy(xpath="//a[@class='button-text']")
	public WebElement clickOnContinuee;
	
	public void SignUpDetails(String mobnum , String email) throws InterruptedException
	{
//		clickOnCross.click();
		Thread.sleep(3000);
		clickoNCancel.click();
		clcikOnSignUp.click();
		Thread.sleep(2000);
		mobNo.sendKeys(mobnum);
		checkBox.click();
		clickOnContinue.click();
		Thread.sleep(2000);
		//enterOTP.click();
		//Thread.sleep(2000);
	//	clickOnDoneBtn.click();
		
		
		clickOnDoneBtn.click();
		Thread.sleep(3000);
		emailID.sendKeys(email);
		clickOnContinuee.click();
	}

}
