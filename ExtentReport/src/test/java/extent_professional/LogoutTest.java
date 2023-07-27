package extent_professional;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


import ExtentManager.exrentreportmanager;

public class LogoutTest {
	
	public static ExtentSparkReporter sr;
	public static ExtentReports exre;
	public static com.aventstack.extentreports.ExtentTest test;
	
@BeforeTest
public void initialize()
{
	exre=exrentreportmanager.getReport();
	//ExtentTest test=exre.createTest("Login Test");
 test=exre.createTest("Logout");
}

@Test
public void Testing()
{
	test.log(Status.INFO, "This is Logout Page");
	test.log(Status.INFO, "Click on Logout button");
	test.log(Status.INFO, "Logout Successfully");
	
	
}


@AfterTest
public void finish()
{
	exre.flush();
}

}
