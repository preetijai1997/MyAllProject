package extent_professional;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


import ExtentManager.exrentreportmanager;

public class Registration {
	public static ExtentSparkReporter sr;
	public static ExtentReports exre;
	public static com.aventstack.extentreports.ExtentTest test;
	
@BeforeTest
public void initialize()
{
	exre=exrentreportmanager.getReport();
			
	//ExtentTest test=exre.createTest("Login Test");
 test=exre.createTest("Registartion");
}

@Test
public void Testing()
{
	test.log(Status.INFO, "This is registration Page");
	test.log(Status.INFO, "Enter the email id and password values");
	test.log(Status.INFO, "After click on the Submit button");
    test.log(Status.INFO,"OTP will be on the  entered email address");
    test.log(Status.INFO, "After that click on the Submit button");
	test.log(Status.INFO, "Registration test pass");
	
	
}


@AfterTest
public void finish()
{
	exre.flush();
}

}
