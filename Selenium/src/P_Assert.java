import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class P_Assert {
	@Test
	public void Critical()
	{
		String ExpectedOutput="She is girl";
		String ActualOutput="She is beautiful girl";
		Assert.assertEquals(ActualOutput, ExpectedOutput);
	}
	
	@Test
	public void High()
	{
		SoftAssert softassert=new SoftAssert();
		boolean b1= 2>3;
		boolean b2= 4>3;
		Assert.assertTrue(b1!=b2, "b1 is equal to b2");
		
		
		boolean c1=2>3;
		boolean c2=7>6;
		softassert.assertEquals(c1, c2);
		softassert.assertAll();
		
		
}
}
