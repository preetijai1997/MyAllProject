import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bs0452\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://portal.bankit.in:9090/RO/");
		
		driver.switchTo().frame("Main");
		driver.findElement(By.name("userName")).sendKeys("amit.malu@bankit.in");
		driver.findElement(By.name("pass")).sendKeys("Amit@123");
		driver.findElement(By.id("login")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='popup']//span")).click();
		
		
		Thread.sleep(3000);
		
	List<WebElement> links=	driver.findElements(By.tagName("a"));
	
	System.out.println(links.size());
	
	for(int i=0;i<links.size();i++)
	{
	WebElement element=	links.get(i);
	String url=element.getAttribute("href");
	if(url!=null) {
	System.out.println(url);
	
	Thread.sleep(3000);
	URL link=new URL(url);
	
	HttpsURLConnection connect=(HttpsURLConnection)link.openConnection();
	
	Thread.sleep(3000);
	connect.connect();
	
	int resCode=connect.getResponseCode();
	
	if(resCode>400)
	{
		System.out.println(url + "is a broken link=="+resCode);
	}
	else
	{
		System.out.println(url + "is not  a broken link"+ resCode);
	}
	

	}

	}

	}
}

