package Test.ExtentReport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentDemo {
	ExtentReports er;
	
	@BeforeTest
	public void config()
	{
	String path=System.getProperty("user.dir")+"\\report\\index.html";
		ExtentSparkReporter reports=new ExtentSparkReporter(path);
		reports.config().setReportName("Preeti Test");
		reports.config().setDocumentTitle("Preeto");
		
		 er=new ExtentReports();
		er.attachReporter(reports);
		er.setSystemInfo("Tester", "Preethvi");
		
	}
	
	@Test
	public void initialDemo()
	{
		er.createTest("Intial Demo");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bs0452\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://uat.bankit.in/CAPS/");
		System.out.println(driver.getTitle());
		er.flush();
	}

}
