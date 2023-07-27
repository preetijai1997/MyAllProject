package SeleniumTutorialPractice;

import org.testng.annotations.Test;

import ui.Suites;

public class Executable extends Suites{
	
	
	@Test(groups="regression")
	public void testcase1()
	{
		System.out.println("Test case1");
	}
	
	@Test(groups={"snaity","regression"})
	public void testcase2()
	{
		System.out.println("Test case2");
	}

}
