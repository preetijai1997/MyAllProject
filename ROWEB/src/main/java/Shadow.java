import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shadow {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bs0452\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		System.out.println(driver);
		driver.get("chrome://downloads/");
		
		JavascriptExecutor jse=	(JavascriptExecutor)driver;
       WebElement ele=(WebElement)jse.executeScript("return \r\n"
       		+ "﻿\r\n"
       		+ "document.querySelector(\"body > downloads-manager\").shadowRoot.querySelector(\"#toolbar\").shadowRoot.querySelector(\"#toolbar\").shadowRoot.querySelector(\"#search\").shadowRoot.querySelector(\"#searchInput\")");
      
       
     String js="arguments[0].setAttribute('value','VSCodeUserSetup-x64-1.66.2 (1).exe')";
     ((JavascriptExecutor)driver).executeScript(js, ele);
	
	}

}
