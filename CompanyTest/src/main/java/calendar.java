import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class calendar {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bs0452\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.spicejet.com/");
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//div[@class=\"css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep\"]/input[@value='Delhi (DEL)']")).click();
		
		driver.findElement(By.xpath("//*[contains(text(),'BLR')]")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[contains(text(),'AGR')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@data-testid='undefined-calendar-day-8']//div[@class='css-76zvg2 r-jwli3a r-ubezar r-16dba41']")).click();
		
	}

}
