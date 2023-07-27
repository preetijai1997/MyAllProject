package SeleniumTutorialPractice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvideTest {
	
	@Test(dataProvider="create",dataProviderClass=DataProvideDemo.class)
	public void test(String username, String pass)
	{
		System.out.println(username+"  "+pass);
	}
	
	@Test(dataProvider="create",dataProviderClass=DataProvideDemo.class)
	public void test1(String username, String pass,String test)
	{
		System.out.println(username+"  "+pass+" "+test);
	}
	
	@Test(dataProvider="create",dataProviderClass=DataProvideDemo.class)
	public void test2(String username, String pass,String test,String text1)
	{
		System.out.println(username+"  "+pass+" "+test+" "+text1);
	}
	
	
}
