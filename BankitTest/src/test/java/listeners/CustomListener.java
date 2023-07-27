package listeners;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.relevantcodes.extentreports.LogStatus;

import base.TestBase;
import utilitity.TestUtils;

public class CustomListener extends TestBase implements ITestListener{
	
	public void onFinish(ITestContext arg0) {					
        // TODO Auto-generated method stub				
        		
    }		

    public void onStart(ITestContext arg0) {					
        // TODO Auto-generated method stub				
        		
    }		

    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {					
        		
        		
    }		
    public void onTestFailure(ITestResult arg0) {		
    	
    	System.setProperty("org.uncommons.reportng.escape-output", "false");

    	
    	try {
    		TestUtils.captureScreenshot();
		} catch (IOException e) {
			e.printStackTrace();
		}
    	test.log(LogStatus.FAIL, test.addScreenCapture(TestUtils.screenShotName));
    	 reo.endTest(test);
         reo.flush();
    	Reporter.log("<a  target=\"_blank\" href="+TestUtils.screenShotName+">Screenshot</a>");
		Reporter.log("<br>");
		Reporter.log("<a  target=\"_blank\" href="+TestUtils.screenShotName+"> <img src="+TestUtils.screenShotName+" height=200 width=300> </img></a>");	
        		
    }		

		
    public void onTestSkipped(ITestResult arg0) {					
        // TODO Auto-generated method stub				
        		
    }		
	
    public void onTestStart(ITestResult arg0) {					
       
    	test= reo.startTest(arg0.getName().toUpperCase());
        		
    }		

	
    public void onTestSuccess(ITestResult arg0) {					
     test.log(LogStatus.PASS, arg0.getName().toUpperCase()+ "PASS");
     reo.endTest(test);
     reo.flush();
        		
    }		

}
