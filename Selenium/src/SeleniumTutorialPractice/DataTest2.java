package SeleniumTutorialPractice;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataTest2 {
	@DataProvider(name="create")
	public Object[][] dataset(Method m)
	{
		Object[][] dataset1=null;
		if(m.getName().equals("test"))
		{
		 dataset1= new Object[][] 
		{
			{"username1","password1"},
			{"username2","password2"},
			{"username3","password3"},
			{"username4","password4"}
			};
		}
		else if(m.getName().equals("test1"))
		{
		 dataset1= new Object[][] 
		{
			{"username1","password1","test2"},
			{"username2","password2","test3"},
			{"username3","password3","test4"},
			{"username4","password4","test5"}
			};
		}
			
return dataset1;
}
}
