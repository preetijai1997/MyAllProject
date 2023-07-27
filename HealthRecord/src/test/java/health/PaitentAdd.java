package health;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PaitentAdd {

	public static void main(String[] args) throws InterruptedException 
	{

		Map<String, Object> mobileEm = new HashMap<String, Object>();

		mobileEm.put("deviceName", "Samsung Galaxy S8+");

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bs0452\\Downloads\\browsers\\chromedriver.exe");

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");

		option.setExperimentalOption("mobileEmulation", mobileEm);
		option.addArguments("force-device-scale-factor=0.75");
		option.addArguments("high-dpi-support=0.75");

		WebDriver driver = new ChromeDriver(option);

		driver.get("https://stag.1mg.com/");

		driver.findElement(By.xpath("//div[@class='flex alignCenter ShellHeader__navButton__yxN4Y']")).click();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();

		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("9811107628");
		driver.findElement(By.xpath("//span[contains(text(),'Get verification')]")).click();

		Thread.sleep(3000);
		List<WebElement> inputVal = driver.findElements(By.xpath("(//div[@class=\"flex marginTop-4\"])[5]/input"));

		String otp = "214263";

		for (int i = 0; i < inputVal.size(); i++) {

			WebElement otpval = inputVal.get(i);
			char result = otp.charAt(i);
			int a = result - '0';
			otpval.sendKeys(String.valueOf(a));

		}

		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Continue']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='flex alignCenter ShellHeader__navButton__yxN4Y']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//img[@class=\" ImageLoader__img-loaded__wfU_q\"])[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='My health records']")).click();
		Thread.sleep(5000);
		/*
		 driver.findElement(By.xpath("//button[text()='Add new patient']")).click();
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("(//input[@name='name'])[2]")).sendKeys("preeti")
		  ; Thread.sleep(5000); //public static Properties p;
		 
		 //((JavascriptExecutor)driver).executeScript
		 //("document.getElementsByName('dob')");
		  WebElement date = driver.findElement(By.xpath("(//input[@type=\"date\"])[1]"));
			//date.sendKeys(Keys.TAB);
			Thread.sleep(10000);
			
			date.sendKeys("11");

			Thread.sleep(10000);
			date.sendKeys(Keys.TAB);
			Thread.sleep(10000);
			date.sendKeys("10");
			Thread.sleep(10000);
			
			date.sendKeys(Keys.TAB);
			//date.sendKeys(Keys.TAB);
			Thread.sleep(10000);
			date.sendKeys("1997");
			Thread.sleep(10000);
			Select s= new
		  Select(driver.findElement(By.
		  xpath("(//select[@class=\"Dropdown__select__fGk5B Dropdown__placeholder__WkKl1\"])[1]"
		  ))); s.selectByValue("f");
		 
		 Thread.sleep(5000);
		 
		 Select sc= new Select(driver.findElement(By.
		 xpath("//select[@class=\"Dropdown__select__fGk5B Dropdown__placeholder__WkKl1\"]"))); 
		 sc.selectByValue("Daughter");
		 driver.findElement(By.xpath("//span[text()='Add']")).click();
		
		driver.findElement(By.xpath("//button[text()='Add new']")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("(//input[@name=\"name\"])[1]")).sendKeys("vindu");
		WebElement date = driver.findElement(By.xpath("(//input[@type=\"date\"])[1]"));
		date.sendKeys("11");

		Thread.sleep(10000);
		date.sendKeys(Keys.TAB);
		Thread.sleep(10000);
		date.sendKeys("10");
		Thread.sleep(10000);
		
		date.sendKeys(Keys.TAB);
		//date.sendKeys(Keys.TAB);
		Thread.sleep(10000);
		date.sendKeys("1997");
		Thread.sleep(10000);
		
		Select sc = new Select(driver
				.findElement(By.xpath("//select[@class=\"Dropdown__select__fGk5B Dropdown__placeholder__WkKl1\"]")));
		sc.selectByValue("f");
		
		Select relation= new Select(driver.findElement(By.xpath("(//select[@class=\"Dropdown__select__fGk5B Dropdown__placeholder__WkKl1\"])[1]")));
		
		relation.selectByValue("Self");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[text()='Add']")).click();
 */
	}


	}


