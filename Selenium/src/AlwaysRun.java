import org.testng.annotations.Test;

public class AlwaysRun {
	
	@Test(priority=1, enabled=true)
	public void First()
	{
		System.out.println("First Case");
	}
	@Test(priority=2, enabled=true, alwaysRun=true)
	public void Second()
	{
		System.out.println("Second Case");
	}
	@Test(priority=3, dependsOnMethods="Second",alwaysRun=true)
	public void Third()
	{
		System.out.println("Third case");
	}
	@Test(priority=4, alwaysRun=true, enabled=true)
	public void Fourth()
	{
		System.out.println("Fourth Case");
	}

}
