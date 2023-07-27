import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class smithaFirstCode {

	
	public static void main(String [] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bs0452\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		/*
		driver.get("https://uat.bankit.in/RO/");
		driver.manage().window().maximize();
		//System.out.println(driver.getClass());
		
		String URL=driver.getCurrentUrl();
		System.out.println("URL of this page is: "+URL);
		
	boolean verifyTitle=	driver.getPageSource().contains("title");
	System.out.println(verifyTitle);
	
	driver.switchTo().frame("Main");
	String text=driver.findElement(By.xpath("//div[@class='col-md-3 footer_wd'][1]/h4")).getText();
	
	System.out.println("text is: "+text);
	
	String attribute=driver.findElement(By.name("userName")).getAttribute("autocomplete");
	System.out.println(attribute);
	
	
	driver.findElement(By.name("userName")).sendKeys("shobhit.rai@bankit.in");
	driver.findElement(By.id("password")).sendKeys("12345");
	Thread.sleep(4000);
	driver.findElement(By.id("login")).click();
	

		driver.get("http://www.facebook.com/");
		WebElement txtUsername = driver.findElement(By.id("email"));
		
		Actions ac= new Actions(driver);
		 ac
				.moveToElement(txtUsername)
				.click()
				.keyDown(txtUsername, Keys.SHIFT)
				.sendKeys(txtUsername, "hello")
				.keyUp(txtUsername, Keys.SHIFT)
				
				.contextClick()
				.build().perform();
				
				*/
		
		driver.get("https://demo.guru99.com/test/upload/");
		
	WebElement ele=	driver.findElement(By.name("uploadfile_0"));
	
	ele.sendKeys("C:\\Users\\bs0452\\eclipse\\java-2021-09\\eclipse\\eclipse.exe");
	
	WebElement check=driver.findElement(By.id("terms"));
	check.click();
	boolean ABC=check.isSelected();
	System.out.println(ABC);
	driver.findElement(By.id("submitbutton")).click();
	
	
	String text=driver.findElement(By.xpath("//h3[@id='res']/center")).getText();
	System.out.println(text);
				
	}
}
