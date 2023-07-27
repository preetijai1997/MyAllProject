package filpkartTestWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FilpKartTest {

	public static void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\bs0452\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.swiggy.com/");
		//driver.findElement(By.xpath("//a[@class='r2iyh']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.id("mobile")).sendKeys("9616144811");
//		driver.findElement(By.id("name")).sendKeys("Preeti Jaiswal");
//		driver.findElement(By.id("email")).sendKeys("preeti1814004@akgec.ac.in");
//		driver.findElement(By.id("password")).sendKeys("Preeti1197@");
//		driver.findElement(By.xpath("//a[@class='a-ayg']")).click();
		
driver.findElement(By.xpath("//span[@class='LukWG']")).click();
Thread.sleep(4000);
JavascriptExecutor js= (JavascriptExecutor)driver;
js.executeScript("window.scrollBy(0,300)");
driver.findElement(By.xpath("//*[@id=\"all_restaurants\"]/div/div[2]/div[1]/div/div[1]/div[1]/a")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//*[@id=\"h-1950595611\"]/div[2]/div[1]/div[1]/div/div[2]/div[2]/div/div[1]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//*[@id=\"modal-placeholder\"]/div[3]/div/div[2]/div/div[3]/div[2]")).click();

		
		
		
		
		
		
		
		
		
		
		
		

	}

}
