import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationCheck {

	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bs0452\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
	WebElement msg=	driver.findElement(By.xpath("//div[@class='example']/p"));
	System.out.println(msg.getText());
		 

	}

}
