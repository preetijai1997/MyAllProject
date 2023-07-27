import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class latestFeature {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\bs0452\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
//		WebElement nameLabel=driver.findElement(By.name("name"));
//		String labelPrint=driver.findElement(with(By.tagName("label")).above(nameLabel)).getText();
//        System.out.println(labelPrint);
		
//		WebElement dateofBirthLabel=driver.findElement(By.xpath("//label[@for='dateofBirth']"));
//		driver.findElement(with(By.tagName("input")).below(dateofBirthLabel)).click();
		
	WebElement cheboxLabel=	driver.findElement(By.xpath("//label[@for='exampleCheck1']"));
	
	driver.findElement(with(By.tagName("input")).toLeftOf(cheboxLabel)).click();
	
	
	WebElement radioFirst=driver.findElement(By.id("inlineRadio1"));
	String labelText=driver.findElement(with(By.tagName("label")).toRightOf(radioFirst)).getText();
	System.out.println(labelText);
	}

}
