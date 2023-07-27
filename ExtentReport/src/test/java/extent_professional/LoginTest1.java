package extent_professional;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


import ExtentManager.exrentreportmanager;

public class LoginTest1 {
	
	public static ExtentSparkReporter sr;
	public static ExtentReports exre;
	public static com.aventstack.extentreports.ExtentTest test;
	
@BeforeTest
public void initialize()
{
	
	exre=exrentreportmanager.getReport();
			
	//ExtentTest test=exre.createTest("Login Test");
    test=exre.createTest("Login");
}

@Test
public void Testing()
{
	test.log(Status.INFO, "This is login Page");
	test.log(Status.INFO, "Enter the field values");
	test.log(Status.INFO, "After click on the Submit button");
	test.log(Status.FAIL, "404 page not found");
	Assert.assertFalse(false);
	test.log(Status.INFO, "Login test pass");
	
	
}


@AfterTest
public void finish()
{
	exre.flush();
}
}
