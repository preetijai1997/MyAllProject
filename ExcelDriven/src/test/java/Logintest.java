import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Logintest {
	
	
	@BeforeTest
	public void loginApplication()
	{
		System.out.println("Login to the application");
	}

	@Test(priority=1)
	public void firstCase() 
	{
		System.out.println("This is my first test case");
	}
		@BeforeMethod
		public void ConnectToDb()
		{
			System.out.println("DB connect");
		}
		

		@Test(priority=2)
		public void SecondCase()
		{
			System.out.println("This is my second case");
		}
		
		@AfterTest
		public void logoutApplication()
		{
			System.out.println("Logout from Application");
		}
		
		@AfterMethod
		public void DBdisconnect()
		{
			System.out.println("Connection Fail");
		}
		
}
