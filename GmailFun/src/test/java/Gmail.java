import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactoryFinder;

public class Gmail {
	
	public WebDriver driver;
	public Gmail(WebDriver driver)
	{
         
	}


	@FindBy(xpath="driver.findElement(By.id(\"email\"));")
	public WebElement emailId;
	@FindBy(xpath="driver.findElement(By.id(\"pass\"));")
	public WebElement pass;
	@FindBy(xpath="")
	public WebElement loginBtn=driver.findElement(By.name("logBtn"));


	public void loginGmail(String userName, String passWord)
	{

	emailId.sendKeys(userName);
	pass.sendKeys(passWord);
	loginBtn.click();
	}


}
