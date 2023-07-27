import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobutton {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bs0452\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/do/search/flights?title=Book%20Air%20Ticket&Coupon=FLIGHT&utm_source=google&utm_medium=cpc&utm_campaign=Gen:Conv_Broad-DeskTab&dxid=EAIaIQobChMIt8T-68bI9QIV1JhmAh2yngAwEAAYASAAEgKW3PD_BwE&gclid=EAIaIQobChMIt8T-68bI9QIV1JhmAh2yngAwEAAYASAAEgKW3PD_BwE");
        	Thread.sleep(5000);
		WebElement radio1=driver.findElement(By.xpath("//input[@value='Oneway']"));
        radio1.click();
        System.out.println(radio1.isSelected());
        
        System.out.println(driver.findElements(By.xpath("//input[@type='radio']")).size());
		
		
	}

}
