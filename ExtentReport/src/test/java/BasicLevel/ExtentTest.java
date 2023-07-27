package BasicLevel;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentTest {
	
	@Test
	public void initalTest()
	{
		
		String er=System.getProperty("user.dir")+"//target//spark.html";
		ExtentSparkReporter sr=new ExtentSparkReporter(er);
		sr.config().setReportName("Bankit");
		sr.config().setDocumentTitle("Retailer");
		sr.config().setTheme(Theme.DARK);
		
		ExtentReports exre=new ExtentReports();
		exre.attachReporter(sr);
				
		//ExtentTest test=exre.createTest("Login Test");
		com.aventstack.extentreports.ExtentTest test=exre.createTest("Login");
		test.log(Status.INFO, "This is login Page");
		test.log(Status.INFO, "Enter the field values");
		test.log(Status.INFO, "After click on the Submit button");
		test.log(Status.INFO, "Login test pass");
		exre.attachReporter(sr);
		
		exre.flush();
		
	
	
	}

}
