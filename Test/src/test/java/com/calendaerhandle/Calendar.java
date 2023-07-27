package com.calendaerhandle;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;
import javaprogram.util.concurrent.TimeUnit;


public class Calendar {

	public static WebDriver driver;
	 static String url="https://uat.bankit.in/RO/";

	
		public static void dologin() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\bs0452\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(url);
			driver.manage().window().maximize();
			driver.switchTo().frame("Main");
			        //UserName
					WebElement username1=driver.findElement(By.name("userName"));
				    username1.clear();
				    username1.sendKeys("shobhit.rai@bankit.in");
				    
				    //Password
				    WebElement password1=driver.findElement(By.id("password"));
				    password1.clear();
				    password1.sendKeys("Amit@123");
				    
					//Login
				    WebElement loginbtnClick=  driver.findElement(By.id("login"));
				    loginbtnClick.click();
				  
				    //Popup Banner
				    Thread.sleep(2000);
				     driver.findElement(By.xpath("//*[@id=\"popup\"]/div/div/button/span")).click();
				  }

		
		public static  void DMT() throws InterruptedException
		{
		System.out.println("driver="+driver);
		WebElement DMTModule=driver.findElement(By.id("115"));
	    Thread.sleep(2000);
		DMTModule.click();
		 Thread.sleep(2000);
		driver.findElement(By.id("113")).click();
		
		driver.findElement(By.id("mobile_no")).sendKeys("9787812345");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		
		driver.findElement(By.id("c_name")).sendKeys("Preeti Jaiswal");
		
		driver.findElement(By.id("c_address")).sendKeys("Noida");
		
		driver.findElement(By.id("c_dob")).click();
		
		String date="2004-Mar-32";
		String dateArr[]=date.split("-");
		String year=dateArr[0];
		String month=dateArr[1];
		String day=dateArr[2];
		
	Select select=	 new Select (driver.findElement(By.xpath("//select[@data-handler='selectMonth']")));
	select.selectByVisibleText(month);
	
	Select select1=	new Select( driver.findElement(By.xpath("//select[@data-handler='selectYear']")));
	select1.selectByVisibleText(year);
	
	String before_xpath="//*[@id=\'ui-datepicker-div\']/table/tbody/tr[";
	String after_xpath="]/td[";
	
	final int totalDays=7;
	boolean flag=false;
	 String days=null;
	for(int rowNum=1;rowNum<=6;rowNum++)
	{
		for(int colNum=1;colNum<=totalDays;colNum++)
		{
			
			try {
				 	driver.findElement(By.xpath(before_xpath+rowNum+after_xpath+colNum+"]")).getText();
			}
			catch(NoSuchElementException e)
			{
				System.out.println("Please enter correct date");
				flag=false;
				break;
			}
			
			
		//System.out.println(days);
		
		if(days.equals(day))
		{
			driver.findElement(By.xpath(before_xpath+rowNum+after_xpath+colNum+"]")).click();
			flag=true;
			break;
		}
		
		
		}
		if(flag)
		{
			break;
		}
	}
		
		}
		
		public static void main(String[] args) throws InterruptedException
		{
			dologin();
			Calendar cal=new Calendar();
			
			cal.DMT();
		
		}
}




//*[@id="ui-datepicker-div"]/table/tbody/tr[1]/td[2]

//*[@id="ui-datepicker-div"]/table/tbody/tr[1]/td[3]/a
//*[@id="ui-datepicker-div"]/table/tbody/tr[5]/td[5]/a

//*[@id="ui-datepicker-div"]/table/tbody/tr[1]/td[7]


//*[@id="ui-datepicker-div"]/table/tbody/tr[5]/td[1]

//*[@id="ui-datepicker-div"]/table/tbody/tr[1]/td[1]

		//*[@id="ui-datepicker-div"]/table/tbody/tr[1]/td[2]
		
		//*[@id="ui-datepicker-div"]/table/tbody/tr[1]/td[7]

		//*[@id="ui-datepicker-div"]/table/tbody/tr[5]/td[1]
