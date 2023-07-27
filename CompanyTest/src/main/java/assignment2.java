import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bs0452\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("Preeti Jaiswal");
		driver.findElement(By.name("email")).sendKeys("preetijaiswal504@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Preeti123@");
		driver.findElement(By.id("exampleCheck1")).click();
		WebElement gender=driver.findElement(By.id("exampleFormControlSelect1"));
		
		Select select=new Select(gender);
		Thread.sleep(2000);
		select.selectByVisibleText("Female");
		
		driver.findElement(By.id("inlineRadio1")).click();
		
		driver.findElement(By.name("bday")).sendKeys("11-10-1997");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		
		System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());

	}

}
