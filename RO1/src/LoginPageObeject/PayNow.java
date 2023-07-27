package LoginPageObeject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PayNow {
	public PayNow(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="payifsc1")
	public WebElement btnPayNow;
	
	@FindBy(id="amount")
	public WebElement txtAmt;
	
	@FindBy(id="charge")
	public WebElement BankitFess;
	
	@FindBy(id="tamt")
	public WebElement textTA;
	
	@FindBy(id="remark")
	public WebElement textRemark;
	
	@FindBy(xpath="/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/div[3]/form[1]/table[1]/tbody[1]/tr[10]/td[3]/input[1]")
	public WebElement btnSelect;
	
	@FindBy(id="img_btn")
	public WebElement btnPay;
	
	@FindBy(xpath="//div[@class='col-md-3']//input[@id='print']")
	public WebElement btnprint;
	
	@FindBy(xpath="//div[@class='col-md-3']//a//input[@id='back']")
	public WebElement btnBack;
//@FindBy(id="print")
	//public WebElement btnPrint;
}
