package BankitAgentWebPortal.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BankitAgentWebPortal.AbstratctComponent.AbstractComponent;

public class LandingPage extends AbstractComponent{
	 
	WebDriver driver;
	
	public LandingPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="userEmail")
	WebElement userEmail;
	
	@FindBy(id="userPassword")
	WebElement userPass;
	
	@FindBy(id="login")
	WebElement submit;
	
	public void login(String email, String Pass)
	{
		userEmail.sendKeys(email);
		userPass.sendKeys(Pass);
		submit.click();
	}
	
	public void goTo()
	{
		driver.get("https://rahulshettyacademy.com/client/");
	}
	
	

}
