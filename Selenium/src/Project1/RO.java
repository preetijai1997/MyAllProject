package Project1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RO {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\bs0452\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

	//Get Login Page
		driver.get("https://uat.bankit.in/RO/");
		driver.switchTo().frame(driver.findElement(By.name("Main")));
		driver.findElement(By.name("userName"));
		driver.findElement(By.id("password")).sendKeys("Amit@123");
		driver.findElement(By.id("login")).click();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("body.modal-open:nth-child(2) section.main_space:nth-child(9) div.modal.fade.in:nth-child(3) div.modal-dialog.modal-lg div.modal-content.pA10 button.close:nth-child(1) > span:nth-child(1)")).click();
	Thread.sleep(3000);
	driver.findElement(By.linkText("DMT")).click();
	driver.findElement(By.id("113")).click();
	driver.findElement(By.id("mobile_no")).sendKeys("8957181611");
//	driver.findElement(By.xpath("[value='Clear']")).click();
	//driver.findElement(By.className("form_submit_btn")).click();
	driver.findElement(By.cssSelector("[value='Submit']")).click();
	//driver.findElement(By.name("c_name")).sendKeys("Vinduu");
	 driver.findElement(By.id("c_name"));
	}
}
