package bankit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadOTP {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\bs0452\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://onedrive.live.com/about/en-us/signin");
		Thread.sleep(3000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='SignIn']")));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//main[@class='inner']/div[2]/div[2]/div/input[@type='email']")).sendKeys("preetijaiswal504@gmail.com");
        driver.findElement(By.xpath("//input[@value='Next']")).click();
        Thread.sleep(6000);
        driver.findElement(By.id("idA_PWD_ForgotPassword")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@class='inline-block']/input[@id='iSelectProofAction']")).click();
	}

}
