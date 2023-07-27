import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bs0452\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[1]")).click();

		String selectedOption = driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[1]")).getText();

		WebElement ele = driver.findElement(By.id("dropdown-class-example"));
		Select select = new Select(ele);

		select.selectByVisibleText(selectedOption);

		WebElement enterValue = driver.findElement(By.id("name"));
		enterValue.sendKeys(selectedOption);
		driver.findElement(By.id("alertbtn")).click();

		Alert alert = driver.switchTo().alert();

		System.out.println(alert.getText());
		alert.accept();

	}

}
