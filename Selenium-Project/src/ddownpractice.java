import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ddownpractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bs0452\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://testproject.io/?utm_source=google-ads&utm_campaign=website_testing&utm_agid=116246299425&utm_term=automated%20web%20testing&creative=492868597094&device=c&placement&gclid=EAIaIQobChMI05yMlfbF9QIVw5hmAh0MmAoQEAAYASAAEgKdePD_BwE");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@id='cc-button']")).click();
        driver.findElement(By.name("your-email")).sendKeys("preetijaiswal504@gmail.com");
        driver.findElement(By.xpath("//input[@value='Create an Account']")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("first-name")).sendKeys("Preeti");
        driver.findElement(By.id("last-name")).sendKeys("Jaiswal");
        driver.findElement(By.id("password")).sendKeys("PreetiloveVindi");
        driver.findElement(By.xpath("//span[@class='tp-checkbox-input-view']")).click();
       // driver.findElement(By.xpath("//div[@class='tp-submit-wrapper']//input[@id='tp-continue-btn']")).click();
        driver.findElement(By.xpath("//*[@id=\"tp-form\"]/div[10]/a")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("username")).sendKeys("preetijaiswal504@gmail.com");
        driver.findElement(By.id("password")).sendKeys("PreetiloveVindi");
        driver.findElement(By.xpath("//span[@class='tp-checkbox-input-view']")).click();
        driver.findElement(By.id("tp-sign-in")).click();
        System.out.println(driver.findElement(By.id("tp-message-error")).getText());
        driver.findElement(By.linkText("Forgot your password?")).click();
        driver.findElement(By.id("username")).sendKeys("Preeti123@");
        driver.findElement(By.name("reset")).click();
	}

}
