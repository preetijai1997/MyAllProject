package SeleniumTutorialPractice;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class skiptest {

	Boolean dataSetup=false; 
	
	@Test(enabled=false)
	public void skiptest1()
	{
		System.out.println("This test is skip");
	}
	
	@Test
	public void customSkipTest()
	{
		System.out.println("Custom skip");
		throw new SkipException("By default not execute");
	}
	
	@Test
	public void skipCondition()
	{
		System.out.println("Skip according to Condition");
		
		if(dataSetup==true)
		{
			System.out.println("Test case execute");
		}
		
		else
			
		{
			System.out.println("Test case not execute");
		}
	}
	

}
