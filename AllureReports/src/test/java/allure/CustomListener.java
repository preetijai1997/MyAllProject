package allure;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import io.qameta.allure.Allure;

public class CustomListener implements ITestListener {
	
	
	public void onFinish(ITestContext contextFinish) {
	System.out.println("onFinish method finished");

	}

	public void onStart(ITestContext contextStart) {
	System.out.println("onStart method started");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	System.out.println("Method failed with certain success percentage"+ result.getName());

	}

	public void onTestFailure(ITestResult result) {
	
	try {
		InputStream is= new FileInputStream("C:\\Users\\bs0452\\Pictures\\Logo.PNG");
		Allure.addAttachment("Screenshot", is);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

	public void onTestSkipped(ITestResult result) {
	System.out.println("Method skipped"+ result.getName());

	}

}
