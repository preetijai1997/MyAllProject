import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitAssignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bs0452\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		
		
		WebElement radioBtn=driver.findElement(By.xpath("//label[@class='customradio']/input[@value='user']"));
		radioBtn.click();
		
		Thread.sleep(4000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(7000));
	driver.findElement(By.id("okayBtn")).click();
	
	Thread.sleep(3000);
	
	Select select=new Select(driver.findElement(By.xpath("//div[@class='form-group'][4]/select")));
	
	select.selectByValue("consult");
	
	
	driver.findElement(By.id("terms")).click();
	driver.findElement(By.id("signInBtn")).click();
	Thread.sleep(4000);
	List <WebElement> products = driver.findElements(By.cssSelector(".card-footer .btn-info"));

	for(int i =0;i<products.size();i++)

	{

	products.get(i).click();

	}

	driver.findElement(By.partialLinkText("Checkout")).click();
	driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
	
	
	
	}

  

}

