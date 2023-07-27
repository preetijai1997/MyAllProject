import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class scrollFunctionality {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\bs0452\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)");
		
		Thread.sleep(4000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=150");
		
       List<WebElement> values= driver.findElements(By.xpath("//div[@class='tableFixHead']/table/tbody/tr/td[4]"));
       
       int sum=0;
       for(int i=0;i<values.size();i++)
       {
    	int val=  Integer.parseInt(values.get(i).getText());
    	System.out.println(val);
    	sum=sum+val;
    	
       }
       System.out.println("Sum of values is: "+ sum);
       
      int text= Integer.parseInt(driver.findElement(By.xpath("//div[@class='totalAmount']")).getText().split(":")[1].trim().split(" ")[0]);
      System.out.println(text);
 Assert.assertEquals(sum, text);
      
       

	}

}
