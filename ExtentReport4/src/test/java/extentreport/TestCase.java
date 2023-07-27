package extentreport;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class TestCase {
	public ExtentSparkReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest test;
	
	
	
	@BeforeTest
	public void setReport()
	{
		
		htmlReporter = new ExtentSparkReporter("./reports/extent.html");
		htmlReporter.config().setEncoding("utf-8");
		htmlReporter.config().setDocumentTitle("Bankit Service Private Limited");
		htmlReporter.config().setReportName("My Account Statement");
		htmlReporter.config().setTheme(Theme.DARK);
		
		
		
		extent= new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		extent.setSystemInfo("NAME", "Preeti Jaiswal");
		extent.setSystemInfo("Orgnization", "BSPL");
		extent.setSystemInfo("Build No", "4.2");
		
	}
	
	@AfterTest
	public void tearDown()
	{
		extent.flush();
	}
	
	@Test
	public void doLogin()
	{
		test=extent.createTest("Login Test");
		System.out.println("Login test successfully.......");
	}
	
	@Test
	public void register()
	{
		test=extent.createTest("Registration Test");
        Assert.fail("Fail due to some technical failure");

	}
	
	@Test
	public void homePage()
	{
		test=extent.createTest("Home Page Test");
		 throw new SkipException("Skipping the test");
		
	}
	
	@AfterMethod
	 public void testResult(ITestResult result)
	 {
		
		if(result.getStatus()== ITestResult.FAILURE)
		{
			String excepionMessage = Arrays.toString(result.getThrowable().getStackTrace());
			test.fail("<details>" + "<summary>" + "<b>" + "<font color=" + "red>" + "Exception Occured:Click to see"
					+ "</font>" + "</b >" + "</summary>" + excepionMessage.replaceAll(",", "<br>") + "</details>"
					+ " \n");
			
		/*	
			try {

				ExtentManager.captureScreenshot();
				testReport.get().fail("<b>" + "<font color=" + "red>" + "Screenshot of failure" + "</font>" + "</b>",
						MediaEntityBuilder.createScreenCaptureFromPath(ExtentManager.screenshotName)
								.build());
			} catch (IOException e) {

			}*/
			
			

			String failureLogg = "TEST CASE FAILED";
			Markup m = MarkupHelper.createLabel(failureLogg, ExtentColor.RED);
			test.log(Status.FAIL, m);
		}
		
		else if(result.getStatus()== ITestResult.SKIP)
		{
			String methodName=result.getMethod().getMethodName();
			
			String logText="<b> "+" Test Case -------------"+methodName.toUpperCase()+ "</b>";
			
			Markup m= MarkupHelper.createLabel(logText,ExtentColor.LIME);
			test.skip(m);
		}
		
		else if(result.getStatus()== ITestResult.SUCCESS)
		{
			String methodName=result.getMethod().getMethodName();
			
			String logText="<b> "+" Test Case -------------"+methodName.toUpperCase()+ "</b>";
			
			Markup m= MarkupHelper.createLabel(logText,ExtentColor.GREEN);
			test.pass(m);
		}
		
	 }

}
