import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class addToCart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bs0452\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		String[] itemNames= {"Brocolli","Cucumber","Beans"};
		
List<WebElement> product=driver.findElements(By.xpath("//h4[@class='product-name']"));
		
		for(int i=0;i<product.size();i++)
		{
			String[] name=product.get(i).getText().split("-");
		String formattedString=	name[0].trim();
			 
		int j=0;	
		List itemList=Arrays.asList(itemNames);
			if(itemList.contains(formattedString))
			{
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
				
				if(j==itemNames.length)
				{
					break;
				}
				 
			}
			
			
			
		}
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshetty");
		driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
		System.out.println(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='promoInfo']"))).getText());
		
		
		
	}



	}
//for(int j=0;j<ProductName.size();j++) {
//	//	productName=["Laptop","zara"]
//		System.out.println("Product name"+ProductName.get(j)+ProductName.size());
//		for(int i=0;i<allProduct.size();i++) {
//			System.out.println("prod "+allProduct.get(i).getText().equals(ProductName.get(j)));
//			if(allProduct.get(i).getText().equals(ProductName.get(j))) {
//				matchProduct.add(allProduct.get(i));
//				prodId.add(i+1);
//			break;
//				
//			}
//		}
//	}
	
