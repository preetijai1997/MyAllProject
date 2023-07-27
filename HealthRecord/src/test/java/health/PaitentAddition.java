package health;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class PaitentAddition {

	

	public static void main(String[] args) throws InterruptedException  {
		
		
		Map<String, Object> mobileEm = new HashMap<String, Object>();

		mobileEm.put("deviceName", "Samsung Galaxy S8+");

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bs0452\\Downloads\\browsers\\chromedriver.exe");

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");

		option.setExperimentalOption("mobileEmulation", mobileEm);
		option.addArguments("force-device-scale-factor=0.75");
		option.addArguments("high-dpi-support=0.75");

		WebDriver driver = new ChromeDriver(option);

		driver.get("https://earth.1mg.com/");
		
		performNeccessaryAction(driver,"//div[@class='flex alignCenter ShellHeader__navButton__yxN4Y']","click","",false);
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);

			performNeccessaryAction(driver,"//div[contains(text(),'Login')]","click","",false);
		
			performNeccessaryAction(driver,"//input[@name='phone']","sendkeys","9898989898",false);
	
		Thread.sleep(4000);
		performNeccessaryAction(driver,"//span[contains(text(),'Get verification')]","click","",false);
		
		getOTP(driver);
		Thread.sleep(3000);
		performNeccessaryAction(driver,"//span[text()='Continue']","click","",false);
		
		Thread.sleep(4000);
	
			performNeccessaryAction(driver,"//input[@name='email']","sendkeys","preetijaiswal@gmail.com",true);
			//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("preetijaiswal@gmail.com");
			performNeccessaryAction(driver,"//span[text()='Continue']","click","",true);
			//driver.findElement(By.xpath("//span[text()='Continue']")).click();
		
		

		
		
		Thread.sleep(4000);
		performNeccessaryAction(driver,"//div[@class='flex alignCenter ShellHeader__navButton__yxN4Y']","click","",false);
		
		Thread.sleep(4000);
		
				performNeccessaryAction(driver,"(//img[@class=\" ImageLoader__img-loaded__wfU_q\"])[2]","click","",false);
				Thread.sleep(4000);	
				performNeccessaryAction(driver,"//div[text()='My health records']","click","",false);
				Thread.sleep(3000);
				performNeccessaryAction(driver,"(//img[@alt=\"close sheet\"])[7]","click","",true);
				
				Thread.sleep(4000);	
						performNeccessaryAction(driver,"(//div[text()='Docstring New Name'])[1]","click","",false);
						
						
						
						Thread.sleep(4000);	
						
						performNeccessaryAction(driver,"//span[text()='Add medicines to list']","click","",true);
						Thread.sleep(3000);
						
						performNeccessaryAction(driver,"//input[@placeholder=\"Search medicine\"]","sendkeys","telma",false);
						
						Thread.sleep(3000);
								performNeccessaryAction(driver,"(//div[@class=\"col-5 textPrimary\"])[1]","click","",false);
								
								Thread.sleep(3000);
						performNeccessaryAction(driver,"//div[text()='Telma 40 Tablet']","click","",true);
						
						Thread.sleep(4000);
						if(elementPresent(driver,"//select[@class=\"Dropdown__select__fGk5B false\"]"))
						{
				Select sc= new Select(driver.findElement(By.xpath("//select[@class=\"Dropdown__select__fGk5B false\"]")));
				sc.selectByValue("2");
						}
						Thread.sleep(6000);
						performNeccessaryAction(driver,"//span[text()='Add to list']","click","",false);
						
						Thread.sleep(6000);
						performNeccessaryAction(driver,"(//div[text()='Telma 40 Tablet'])[1]","click","",false);
						Thread.sleep(6000);
					//	performNeccessaryAction(driver,"//span[text()='Add to cart']","click","",true);
						//Thread.sleep(6000);
						performNeccessaryAction(driver,"//span[text()='Go to cart']","click","",false);
						Thread.sleep(6000);
						performNeccessaryAction(driver,"//span[text()='Continue']","click","",false);
						Thread.sleep(6000);
						performNeccessaryAction(driver,"(//span[text()='Continue'])[2]","click","",false);
						Thread.sleep(6000);
						
						performNeccessaryAction(driver,"//input[@name=\"pincode\"]","sendkeys","201014",false);
						Thread.sleep(3000);
						
						performNeccessaryAction(driver,"//textarea[@name=\"address\"]","sendkeys","436 niti khAand",false);
						Thread.sleep(3000);
						performNeccessaryAction(driver,"//input[@name=\"name\"]","sendkeys","preeti",false);
						Thread.sleep(3000);
						performNeccessaryAction(driver,"//input[@name=\"number\"]","sendkeys","8957181311",false);
						Thread.sleep(3000);
						performNeccessaryAction(driver,"//span[text()='Home']","click","",false);
						Thread.sleep(3000);
						
						performNeccessaryAction(driver,"//span[text()='Save and continue']","click","",false);
						Thread.sleep(5000);
						
						
						
								
								
								
								
	}	

	public static void getOTP(WebDriver driver)
	{
		
		List<WebElement> inputVal = driver.findElements(By.xpath("(//div[@class=\"flex marginTop-4\"])[5]/input"));
		String otp = "214263";

		for (int i = 0; i < inputVal.size(); i++) {

			WebElement otpval = inputVal.get(i);
			char result = otp.charAt(i);
			int a = result - '0';
			otpval.sendKeys(String.valueOf(a));
	}

}
	public static boolean elementPresent(WebDriver driver,String path) 
	{
		try
		{
			driver.findElement(By.xpath(path));
		}
		catch (NoSuchElementException e)
		{
			return false;
		}
		
		
		return true;
	}
	
	public static void performNeccessaryAction(WebDriver driver, String path, String action, String val,boolean isContinue)
	{
		boolean isPresent= elementPresent(driver,path);
		if(isPresent)
		{
		if(action.equals("click"))
		{
			driver.findElement(By.xpath(path)).click();
		}
		else if(action.equals("sendkeys"))
		{
			driver.findElement(By.xpath(path)).sendKeys(val);
		}
		
		
		else
		{
			System.out.println("Action can not be perform");
		}
		}
		else
		{
			System.out.println("element not present: " + path);
			if(!isContinue)
			{
				return;
			}
			
		}
		
	}

}
