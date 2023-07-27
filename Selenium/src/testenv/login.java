package testenv;

import org.testng.Assert;
import org.testng.annotations.Test;

public class login {
	@Test
	public void login1()
	{
		System.out.println("This is login test");
	}

	@Test
	public void checking()
	{
		Assert.assertFalse(false);
	}
}
