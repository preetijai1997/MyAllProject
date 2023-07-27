package BankitAgentWebPortal;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import BankitAgentWebPortal.pageobjects.LandingPage;
import BankitAgentWebPortal.pageobjects.productCataloguge;

public class StandloneTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\bs0452\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	List<String> ProductName=new ArrayList<>();
	ProductName.add("LAPTOP");
	ProductName.add("IPHONE 13 PRO");
	ProductName.add("AUTOMATION");
		
		driver.get("https://rahulshettyacademy.com/client/");
		LandingPage landingpage = new LandingPage(driver);
		landingpage.goTo();
		landingpage.login("anshika@gmail.com", "Iamking@000");
//		driver.findElement(By.id("userEmail")).sendKeys("anshika@gmail.com");
//		driver.findElement(By.id("userPassword")).sendKeys("Iamking@000");
//		driver.findElement(By.id("login")).submit();
//        Thread.sleep(4000);		
//		List<WebElement> products=driver.findElements(By.cssSelector(".mb-3"));
//		System.out.println(products.size());
		productCataloguge product = new productCataloguge(driver);
        List<WebElement> products = product.getProductsList();
		// product.getProductName();
        JavascriptExecutor js= (JavascriptExecutor)driver;
    	js.executeScript("window.scrollBy(0,400)");
        product.addTocart(ProductName);
        

	}

}
