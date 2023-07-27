package labspageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LabsPageObject {

  
	public LabsPageObject(WebDriver driver) {
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\bs0452\\Downloads\\chromedriver_win32 (11)\\chromedriver.exe");
//		driver = new ChromeDriver();
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath="//button[text()='Cancel']")
	public WebElement clickOnCancelBtn;
	
	
	
	@FindBy(xpath="//span[@class='style__closeOld___3PoPd']")
	public WebElement clickOnCross;
	
	@FindBy(xpath="//div[@class='style__card-wrapper___CiDL5 style__first-card___3Ndog']/div/div[2]/div[1]/span/span/button")
	public WebElement clickOnAddToCart;
	
	@FindBy(xpath="//div[@class='style__card-wrapper___CiDL5 style__first-card___3Ndog']/div/div[2]/div[1]/span/span/a/button")
	public WebElement clickOnAddedToCart;
	
	@FindBy(xpath="//button[text()='SCHEDULE']")
	public WebElement clickOnSchedule;
	
	@FindBy(xpath="//button[text()='Select Patient']")
	public WebElement clickOnSelectPatient;
	
	@FindBy(xpath="//button[text()='Select Address']")
	public WebElement clickOnSelectAddress;
	
	@FindBy(xpath="//span[@class='style__arrows___377nc style__pull-right___TdGHe style__pointer___28B7O']")
	public WebElement clickOnNextIcon;
	
	@FindBy(xpath="//div[text()='6:00 AM - 7:00 AM']")
	public WebElement clickOnSlot;
	
	@FindBy(xpath="//button[text()='Select Time Slot']")
	public WebElement clickOnSlotTimeBtn;
	
	@FindBy(xpath="//button[text()='CHECKOUT']")
	public WebElement clickOnCheckout;
	
	@FindBy(xpath="//div[text()='PAY ON DELIVERY']")
	public WebElement clickOnCOD;
	
	@FindBy(xpath="//div[@class='style__container___2gscC']/div[1]")
	public WebElement clickOnCasOnDilivery;
	
	@FindBy(xpath="//button[text()='PLACE ORDER']")
	public WebElement clickOnPlaceOrder;
/*
	@FindBy(xpath = "//li[@data-auto-navlinks='Labs']")
	public WebElement clickOnLabTest;

	@FindBy(xpath = "//div[@class='style__wrapper___38EX7 style__desktop-view___23kyt']")
	public WebElement clickOnClose;

	@FindBy(xpath = "//h3[text()='Comprehensive Gold Full Body Checkup']")
	public WebElement clickOnComprehensive;
	
	@FindBy(xpath="//span[@class='style__text-button___Ov3kN style__desktop-view___2Nj7m']")
	public WebElement clickOnCart;

	public void clickOnLab() throws InterruptedException {
		clickOnLabTest.click();

	}



	public void clickOnFullBodyCheckup() throws InterruptedException {
		
		clickOnComprehensive.click();
		Thread.sleep(4000);
		clickOnCart.click();
	}
*/
	
	public void changeCityPopup()
	{
		clickOnCancelBtn.click();
	}
	
	public boolean isElementPresent(WebDriver driver,String locator) {
	    try {
	    	driver.findElement(By.xpath(locator));
	        return true;
	    } catch (org.openqa.selenium.NoSuchElementException e) {
	        return false;
	    }
	}
	public void clickOnCrossImg(WebDriver driver)
	{
		System.out.println(driver+"-------------");
		
//		if(driver.findElement(By.xpath("//span[@class='style__closeOld___3PoPd']")) != null)
//		{
		clickOnCross.click();
		//}
		
	}
	
	public void addTOCART() 
	{
		clickOnAddToCart.click();
		
	}
	
	public void addedtocart() throws InterruptedException
	{
		Thread.sleep(2000);
		clickOnAddedToCart.click();
	}
	
	public void schedule()
	{
		clickOnSchedule.click();
	}
	
	public void selectPatientPopup()
	{
		clickOnSelectPatient.click();
	}
	
	public void selectAddress()
	{
		clickOnSelectAddress.click();
	}
	
	public void clickonnextIcon()
	{
		clickOnNextIcon.click();
	}
	
	public void clickOnSlotTime()
	{
		clickOnSlot.click();
	}
	
	public void clickOnSlotTimeBtnn()
	{
		clickOnSlotTimeBtn.click();
	}
	
	public void clickOnCheckOutBtn()
	{
		clickOnCheckout.click();
	}
	
	public void payOnDilivery()
	{
		clickOnCOD.click();
	}
	
	public void clickOnCashDilivery()
	{
		clickOnCasOnDilivery.click();
	}
	
	public void placeOrder()
	{
		clickOnPlaceOrder.click();
	}
}
