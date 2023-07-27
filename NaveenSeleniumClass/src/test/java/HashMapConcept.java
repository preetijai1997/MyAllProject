import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HashMapConcept {

	static WebDriver driver;
	public static void main(String[] args )
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bs0452\\Downloads\\chromedriver_win32100 (2)\\chromedriver.exe");
		 driver= new ChromeDriver();

		driver.get("https://uat.bankit.in/RO/");
		driver.switchTo().frame("Main");
		driver.findElement(By.name("userName")).sendKeys(getUserName("user1"));
		driver.findElement(By.name("password")).sendKeys(getUserPass("user1"));
	}
	
	public static HashMap<String, String> getCredentials()
	{
		HashMap<String, String> userMap=new HashMap<String, String>();
		
		userMap.put("user1", "aditya.upadhyay@bankit.in:x1opy039");
		userMap.put("user2", "shobhit.rai@bankit.in:Amit@123");
		return userMap;
		
	}
	
	public static String getUserName(String role)
	{
	String credentails=	getCredentials().get(role);
	return credentails.split(":")[0];
	}
	
	public static String getUserPass(String role)
	{
	String credentails=	getCredentials().get(role);
	return credentails.split(":")[1];
	}
}
