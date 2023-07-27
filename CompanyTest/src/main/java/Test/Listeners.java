package Test;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {
	
	
	
	public void onTestSuccess(ITestResult result)
	{

//		System.out.println("Test is pass");
//		System.out.println("Preeti");
	}
	
	public void onTestFailure(ITestResult result)
	{
		//System.out.println("Test is fail" +" " +result.getName());
	}

}
