package Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TesngDay2 {
	
	@Parameters({"URL"})
	@Test
	public void AREMITDMT(String URLName)
	{
		System.out.println("Aremit Process");
		System.out.println("NonKyced");
		System.out.println(URLName);
	
	}
	
	@Test(dataProvider="getData")
	public void Yremit( String username, String pass)
	{
		System.out.println("Yremit Process");
		System.out.println("Full Kyc");
		System.out.println(username);
		System.out.println(pass);
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data= new Object[2][2];
		
		data[0][0]="shobhit.rai@bankit.in";
		data[0][1]="12345";
		
		data[1][0]="preeti.jaiswal@bankit.in";
		data[1][1]="Preeti@1197";
		return data;
		
	}

}
