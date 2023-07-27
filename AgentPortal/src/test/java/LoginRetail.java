import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginRetail {

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bs0452\\eclipse-workspace\\BankitTest\\src\\test\\resources\\executables\\chromedriver.exe");
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver= new ChromeDriver(option);
		
		driver.get("https://portal.bankit.in:9090/RO/");
		driver.manage().window().maximize();
		driver.switchTo().frame("Main");
		driver.findElement(By.name("userName")).sendKeys("8957181611");
		driver.findElement(By.id("password")).sendKeys("119703");
		driver.findElement(By.id("login")).click();

	}

}
