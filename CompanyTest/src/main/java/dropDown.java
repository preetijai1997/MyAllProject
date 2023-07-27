import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bs0452\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		/*
        WebElement ele=	driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select dropdown= new Select(ele);
        
        dropdown.selectByIndex(3);
       System.out.println(dropdown.getFirstSelectedOption().getText());
		
		
		
		driver.findElement(By.id("divpaxinfo")).click();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		int i=1;
		while(i<5)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
		
			i++;
			
		}
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		*/
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("(//a[@value='DEL'])[2]")).click();
	}

}
