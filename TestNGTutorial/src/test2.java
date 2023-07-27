
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class test2 {
  
	
	@Test
	public void WebLogin()
	{
		System.out.println("WebLogin module");
	}
	@Parameters({"URL"})
	@Test
	public void MobileLogin(String urlname)
	{
		System.out.println("Mobile Login");
		System.out.println(urlname);
	}

	@Test(dataProvider="getData")
	public void AppLogin(String usernme, String Pass)
	{
		System.out.println("App Login");
		System.out.println(usernme);
		System.out.println(Pass);
	}
	
	@DataProvider
	public Object[][] getData(){
		Object[][] data=new Object[3][2];	
		data[0][0]="userName";
		data[0][1]="password";
		
		data[1][0]="userFirstName";
		data[1][1]="userPass";
		
		data[2][0]="userSecondName";
		data[2][1]="secondPass";
		
		return data;
		
		
	}
}
