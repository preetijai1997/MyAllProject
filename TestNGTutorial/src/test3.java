import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class test3 {
	@Parameters({"APIKey"})
	@Test(groups="Smoke")
	public void HappyLoan(String keyValue)
	{
		System.out.println("This is happy Loan");
		System.out.println(keyValue);
	}
	
	@Test
	public void FundfinaLoan()
	{
		System.out.println("This is fundfina loan");
		Assert.assertTrue(true);
	}

}

