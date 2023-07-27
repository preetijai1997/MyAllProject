package SeleniumTutorialPractice;

import org.testng.annotations.Test;

public class DataTestDemo1 {
	
	
	@Test(dataProvider="create",dataProviderClass=DataTest2.class)
	public void test(String username, String password)
	{
		System.out.println(username+"  "+password);
	}
	
	@Test(dataProvider="create",dataProviderClass=DataTest2.class)
	public void test1(String username,String password,String test)
	{
		System.out.println(username+" "+password+" "+test);
	}
}


