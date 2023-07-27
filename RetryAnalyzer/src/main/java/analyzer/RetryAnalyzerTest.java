package analyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzerTest implements IRetryAnalyzer{
	int counter=0;
	int retryCount=3;
	
	public boolean  retry(ITestResult result)
	{
		if(counter<retryCount)
		{
			counter++;
			return true;
		}
		return false;
	}
	
	

}
