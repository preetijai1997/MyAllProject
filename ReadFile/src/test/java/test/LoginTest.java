package test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver= new ChromeDriver();
		
		Properties p= new Properties();
		FileInputStream fis= new FileInputStream("C:\\Users\\bs0452\\eclipse-workspace\\ReadFile\\src\\test\\java\\config\\object.properties");
		p.load(fis);
		
		
		//System.out.println(System.getProperty("user.dir"));
		
		//System.out.println(p.getProperty("pass"));
		driver.get(p.getProperty("url"));
		
		driver.switchTo().frame("Main");
		
		driver.findElement(By.xpath(p.getProperty("usernameTextBox"))).sendKeys(p.getProperty("emailId"));
		driver.findElement(By.xpath(p.getProperty("passwordTextBox"))).sendKeys(p.getProperty("pass"));
		driver.findElement(By.xpath(p.getProperty("loginBtn"))).click();
		
		

	}

}
