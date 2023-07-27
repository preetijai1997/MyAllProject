import java.net.HttpURLConnection;
import java.util.Iterator;
import java.util.List;
import java.net.URL;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.net.MalformedURLException;
public class brokenLink {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		
		
		String homePage="https://portal.bankit.in:9090/RO/";
		String url = "";
		HttpURLConnection huc = null;
		int respCode = 200;
System.setProperty("webdriver.chrome.driver", "C:\\Users\\bs0452\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get(homePage);
		driver.switchTo().frame("Main");
		driver.findElement(By.name("userName")).sendKeys("amit.malu@bankit.in");
		driver.findElement(By.id("password")).sendKeys("Amit@123");
		driver.findElement(By.id("login")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='popup']//button/span")).click();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));

		Iterator<WebElement> it = links.iterator();

		while(it.hasNext()){

		url = it.next().getAttribute("href");

		System.out.println(url);

		if(url == null || url.isEmpty()){
		System.out.println("URL is either not configured for anchor tag or it is empty");
		continue;
		}

		if(!url.startsWith(homePage)){
		System.out.println("URL belongs to another domain, skipping it.");
		continue;
		}
		try {
			huc = (HttpURLConnection)(new URL(url).openConnection());

			huc.setRequestMethod("HEAD");

			huc.connect();

			respCode = huc.getResponseCode();

			if(respCode >= 400){
			System.out.println(url+" is a broken link" + "  " +respCode);
			}
			else{
			}

			} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

	}
		

}
		driver.quit();
	}
}
