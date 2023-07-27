package LoginPage;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;



public class roLoginPage {

	public static void main(String[] args) throws InterruptedException, FindFailed  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\bs0452\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.get("https://www.google.com");
		
		/*
		driver.get("https://uat.bankit.in/RO/");
		driver.manage().window().maximize();
		driver.switchTo().frame("Main");
		
		//LogoClick
		WebElement logoClick=driver.findElement(By.xpath("/html/body/div/header/div/div/div/a/img"));
		logoClick.click();
		
		//UserName
		WebElement username1=driver.findElement(By.name("userName"));
	    username1.clear();
	    username1.sendKeys("shobhit.rai@bankit.in");
	    
	    //Password
	    WebElement password1=driver.findElement(By.id("password"));
	    password1.clear();
	    password1.sendKeys("Amit@123");
	    
		//Login
	  WebElement loginbtnClick=  driver.findElement(By.id("login"));
	  loginbtnClick.click();
	  
	  //Popup Banner
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"popup\"]/div/div/button/span")).click();
	  
	  
	  //My Account
	   Thread.sleep(2000);
	  driver.findElement(By.xpath("//button[@data-toggle='dropdown']")).click();
	  
	  //Tatkaal Wallet Recharge
	  driver.findElement(By.linkText("Tatkal Wallet Recharge")).click();
	  
	  //Debit Card
	  driver.findElement(By.id("amount")).sendKeys("100");
	WebElement DebitCard=  driver.findElement(By.xpath("//input[@value='DC']"));
	Boolean b=DebitCard.isSelected();
	System.out.println(b);
	
	 //Card Holder Name
	WebElement cardHolderNmae=driver.findElement(By.xpath("//input[@name='depositorName']"));
	cardHolderNmae.sendKeys("Preeti Jaiswal");
	
	//Card Holder Mobile Number
	WebElement cardHolderMobileNumber=driver.findElement(By.name("depositorMobile"));
	cardHolderMobileNumber.sendKeys("8957181611");
	
	//Remark
	WebElement remarks=driver.findElement(By.xpath("//textarea[@name='remark']"));
	remarks.sendKeys("Testing");
	
	//Checkbox
	WebElement checkBox=driver.findElement(By.id("checkboxId"));
	checkBox.click();
	System.out.println(checkBox.isSelected());
	
	//SubmitBtn
	WebElement Subbtn=driver.findElement(By.id("img_btn"));
	
	Subbtn.click();
	
	
	//Confirmation Page
	//Back Button
	
	WebElement backBtn=driver.findElement(By.xpath("//input[@value='Back']"));
	backBtn.click();
	
	
	//Submit Button
	WebElement SubBtn=driver.findElement(By.id("checkoutbutton"));
	Thread.sleep(2000);
	SubBtn.click();
	
	
	//Vendor Page
	Screen s=new Screen();
	Pattern MasterCard_Img= new Pattern("MasterCard.PNG");
	s.click(MasterCard_Img,2000);
	s.click();
	s.click();
	
	
	//PayNow Button
	Pattern PayNow_BtnImg= new Pattern("PayNowBtn.PNG");
	s.click(PayNow_BtnImg,2000);
	s.click();
	s.click();
	

	driver.quit();
	*/
	
	Screen s=new Screen();
	Pattern GmailImg=  new Pattern("Gmail.PNG");
	s.wait(GmailImg,2000);
	s.click();
	
	
	
	
	
	}

}
