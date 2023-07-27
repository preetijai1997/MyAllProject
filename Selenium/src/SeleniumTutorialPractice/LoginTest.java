package SeleniumTutorialPractice;

import org.testng.annotations.Test;

public class LoginTest {
	
	@Test(priority=1)
	public void login()
	{
		System.out.println("This is login page");
	}
	
	@Test
	public void details()
	{
		System.out.println("This is detail page");
	}
	
	@Test(groups="regression")
	public void logout()
	{
		System.out.println("Logout successfully");
	}

}
