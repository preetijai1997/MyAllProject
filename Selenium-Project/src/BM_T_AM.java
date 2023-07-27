import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BM_T_AM {
	
	@BeforeMethod
	public void signUp()
	{
		System.out.println("Test execute before the method");
	}
	
	@Test
	public void logIn()
	{
		System.out.println("This is ligin page");
	}
	
	@Test
	public void forgotPassword()
	{
		System.out.println("This is forgotpassword page");
	}
	
	@AfterMethod
	public void Logout()
	{
		System.out.println("User has been logout successfully.");
	}

}
