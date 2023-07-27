import java.time.Duration;
import java.util.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;


import org.openqa.selenium.support.ui.WebDriverWait;
public class Synchronization {



public static void main(String[] args) {

// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\bs0452\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();

	WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(30));

driver.get("https://grofers.com/");

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);



driver.findElement(By.xpath("//button[text()='Detect my location']")).click();

 w.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Bengaluru']")));

driver.findElement(By.xpath("//div[text()='Bengaluru']")).click();

int c = 0;// count of items to be added

driver.manage().window().maximize();



String[] items = { "Fortune Soya Health Refined Soyabean Oil (Pouch)",

"Aashirvaad Shudh Chakki Whole Wheat Atta" };

java.util.List<WebElement> products = driver.findElements(By.cssSelector("div.plp-product__name--box"));



// Add to cart//

for (int i = 0; i < products.size(); i++) {

List itemNeededList = Arrays.asList(items);

String productName = products.get(i).getText();

if (itemNeededList.contains(productName)) {

c++;

driver.findElements(By.xpath("//button[@class='add-to-cart__add-btn']")).get(i).click();

w.until(ExpectedConditions.visibilityOfElementLocated(

By.xpath("//a[@class='recommendation-slider__switch recommendation-slider__switch--close']")));

driver.findElement(

By.xpath("//a[@class='recommendation-slider__switch recommendation-slider__switch--close']"))

.click();

if (c == itemNeededList.size()) {

System.out.println("All items Added");

break;

}

}



}



/* Go to checkout */

driver.findElement(By.cssSelector("div[data-test-id='cart-icon']")).click();

driver.findElement(By.cssSelector("button[data-test-id='checkout-button']")).click();



/* Checkout Items */

driver.findElement(By.cssSelector("input[data-test-id='phone-no-text-box']")).sendKeys("9*******65");

w.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[data-test-id='login-next-button']")));

driver.findElement(By.cssSelector("button[data-test-id='login-next-button']")).click();



}



}