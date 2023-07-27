import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class autoSuggistiveSelectOption {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\bs0452\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		WebElement enterText = driver.findElement(By.id("autocomplete"));
		enterText.sendKeys("ind");
		Thread.sleep(2000);

		WebElement selectOption = driver.findElement(By.xpath("//ul[@id='ui-id-1']//div[text()='India'][1]"));
		selectOption.click();

		System.out.println(enterText.getText());

	}

}
