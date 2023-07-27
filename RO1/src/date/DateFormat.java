package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DateFormat {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bs0452\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.findElement(By.id("second_date_picker")).click();
		
		DateFormat df=new DateFormat();
		df.selectDate(driver, "04/March/2022", "dd/MMM/yyyy");
		
		Thread.sleep(5000);
		driver.findElement(By.id("second_date_picker")).click();
		df.selectDate(driver, "04/March/2021", "dd/MMM/yyy");
		
		Thread.sleep(5000);
		driver.findElement(By.id("second_date_picker")).click();
		df.selectDate(driver, "04/March/2023", "dd/MMM/yyy");
	}
	public void selectDate(WebDriver driver, String targetdate,String dateFormat) throws Exception
	{
		Calendar calendar=Calendar.getInstance();
		
		SimpleDateFormat targetdateformat=new SimpleDateFormat(dateFormat);
		Date formatDate;
		try {
		targetdateformat.setLenient(false);
		formatDate=targetdateformat.parse(targetdate);
		calendar.setTime(formatDate);
		int targetDay=calendar.get(Calendar.DAY_OF_MONTH);
		int targetMonth=calendar.get(Calendar.MONTH);
		int targetYear=calendar.get(Calendar.YEAR);

		String actualDate=driver.findElement(By.className("ui-datepicker-title")).getText();
		
		
		calendar.setTime(new SimpleDateFormat("MMM yyyy").parse(actualDate));
		
		int actualMonth=calendar.get(Calendar.MONTH);
		int actualYear=calendar.get(Calendar.YEAR);
		
		while(targetMonth<actualMonth || targetYear<actualYear)
		{
			driver.findElement(By.className("ui-datepicker-prev")).click();
			 actualDate=driver.findElement(By.className("ui-datepicker-title")).getText();
			
			
			calendar.setTime(new SimpleDateFormat("MMM yyyy").parse(actualDate));
			
			 actualMonth=calendar.get(Calendar.MONTH);
			 actualYear=calendar.get(Calendar.YEAR);
			
		}
	
		while(targetMonth>actualMonth || targetYear>actualYear)
		{
			driver.findElement(By.className("ui-datepicker-next")).click();
			 actualDate=driver.findElement(By.className("ui-datepicker-title")).getText();
			
			
			calendar.setTime(new SimpleDateFormat("MMM yyyy").parse(actualDate));
			
			 actualMonth=calendar.get(Calendar.MONTH);
			 actualYear=calendar.get(Calendar.YEAR);
			
		}
		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//td[not(contains(@class,'ui-datepicker-other-month '))]/a[text()="+targetDay+"]")).click();
		
		}
		catch(ParseException e)
		{
			throw new Exception("Please enter valid date");
		}
			}

	}

