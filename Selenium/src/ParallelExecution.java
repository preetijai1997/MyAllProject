import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelExecution {
	WebDriver driver;
	@Test(threadPoolSize= 3, invocationCount=3)
	public void parallel_run_part1()
	{
		System.out.println("This is first test case"+Thread.currentThread().getId());
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bs0452\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com");
	}
	
	@Test
	public void parallel_run_part2()
	{
		System.out.println("This is second test case"+ Thread.currentThread().getId());
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bs0452\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://flipkart.com");
		}
	@Test
	public void parallel_run_part3()
	{
		System.out.println("This is third test case"+ Thread.currentThread().getId());
	}
	@Test
	public void parallel_run_part4()
	{
		System.out.println("This is fourth test case"+ Thread.currentThread().getId());
	}

}
