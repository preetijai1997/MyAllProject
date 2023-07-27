import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class mictest {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options=new ChromeOptions();
		
	HashMap<String,Object> contentsetting=new HashMap<String,Object>();
	HashMap<String,Object> profile=new HashMap<String,Object>();
	HashMap<String,Object> prefs=new HashMap<String,Object>();
	
	contentsetting.put("media_stream", 1);
	profile.put("managed_default_content_setting", contentsetting);
	prefs.put("profile", profile);
	options.setExperimentalOption("prefs", prefs);
	System.setProperty("webdriver.chrome.driver","C:\\Users\\bs0452\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://mictests.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='mic-launcher']")).click();
		Thread.sleep(3000);
	}

}
