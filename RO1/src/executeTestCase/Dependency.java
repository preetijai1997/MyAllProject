package executeTestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependency {
	
	@Test
	public void Test1()
	{
		System.out.println("Test 1");
		Assert.assertTrue(false);
	}
	
	@Test(dependsOnMethods="Test1",alwaysRun=true)
	public void Test2()
	{
		System.out.println("Test 2");
	}
	
	@Test
	public void Test3()
	{
		System.out.println("Test 3");
	}

	
}
