import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class P_softAssert_vs_hardAssert {
	
	@Test
	public void First()
	{
		System.out.println("This is first hard assert");
		Assert.assertTrue(true);
		
		System.out.println("This is second hard assert");
		Assert.assertTrue(true);
		
		System.out.println("This is third hard assert");
		Assert.assertTrue(false);
		
		System.out.println("This is fourth hard assert");
		Assert.assertTrue(true);
	}
	
	@Test
	public void softAssertLogic()
	{
		SoftAssert softassert = new SoftAssert();
		
		System.out.println("This is first soft assert");
		softassert.assertTrue(true);
		
		System.out.println("This is second soft assert");
		softassert.assertTrue(false);
		
		System.out.println("This is third soft assert");
		softassert.assertTrue(true);
		
		softassert.assertAll();
	}
	
}
