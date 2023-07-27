import org.testng.annotations.Test;

public class Priority_Enabled {

	@Test(priority=1)
	public void signup()
	{
		System.out.println("This is signup page");
	}
	@Test(priority=2)
	public void ChangePassword()
	{
		System.out.println("This is change password page");
	}
	@Test(priority=3,enabled=false)
	public void HomePage()
	{
		System.out.println("This is home page");
	}
	@Test(priority=4)
	public void isseCard()
	{
		System.out.println("This is issue card page");
	}
	@Test(priority=5)
	public void logOut()
	{
		System.out.println("This is logout page");
	}

	}


