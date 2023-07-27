import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class resizeable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bs0452\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();
		
		/*WebElement frame=driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frame);
		WebElement ele=driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
		Thread.sleep(2000);
		Actions action=new Actions(driver);
		action.dragAndDropBy(ele, 300, 200).perform();
		*/
		WebElement frame=driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frame);
		WebElement ele=driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
		Thread.sleep(2000);
		Actions action=new Actions(driver);
		action.dragAndDropBy(ele,150,0).perform();
		
		
		
	}

}
