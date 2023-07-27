package SeleniumTutorialPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bs0452\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//print title of webpage
	String script= "return document.title;";
	String title=(String) js.executeScript(script);
	System.out.println(title);
	
	//click to the button
	driver.switchTo().frame("iframeResult");
	js.executeScript("myFunction()");
	Thread.sleep(3000);
	driver.switchTo().alert().accept();
	
	//highlight btn
	WebElement button=driver.findElement(By.xpath("/html/body/button"));
	js.executeScript("arguments[0]. setAttribute('style', 'border:2px solid red; background:yellow')", button);
	
    driver.navigate().to("https://www.w3schools.com");
     js.executeScript("window.scrollBy(0,500)");
	}

}
