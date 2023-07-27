import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.manager.SeleniumManager;

public class Test {

	public static void main(String[] args) {
		
		
		System.out.println(SeleniumManager.getInstance().getDriverPath("chromedriver"));
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
	}

}
