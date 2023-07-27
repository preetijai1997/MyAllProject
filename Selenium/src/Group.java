import org.testng.annotations.Test;
@Test(groups="CompleteClassTestCase")
public class Group {
	
	@Test(groups= {"smoke"})
	public void TC1()
	{
		System.out.println("The out of tc1");
	}
	
	@Test(groups= {"smoke", "snaity"})
	public void TC2()
	{
		System.out.println("The out of tc2");
	}
	
	@Test(groups= {"window.regression"})
	public void TC3()
	{
		System.out.println("The out of tc3");
	}
	
	@Test(groups= {"smoke","snaity","regression"})
	public void TC4()
	{
		System.out.println("The out of tc4");
	}
	
	@Test(groups= {"smoke","unit"})
	public void TC5()
	{
		System.out.println("The out of tc5");
	}

}
