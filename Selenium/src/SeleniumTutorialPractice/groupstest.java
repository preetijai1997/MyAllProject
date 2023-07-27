package SeleniumTutorialPractice;

import org.testng.annotations.Test;

public class groupstest {
    
	@Test(groups="regression")
	public void test1()
	{
		System.out.println("This is test 1");
	}
	
	@Test(groups="smoke")
	public void applicationStart()
	{
		System.out.println("Application is start successfully.");
	}
	
	@Test(groups= {"smoke","snaity"})
	public void usernameAndpass()
	{
		System.out.println("User name is: Preeti and Password is: Vindi");
	}
}
