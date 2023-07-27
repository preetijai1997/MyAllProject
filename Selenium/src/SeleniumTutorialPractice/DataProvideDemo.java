package SeleniumTutorialPractice;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataProvideDemo {
	@DataProvider(name="create")
	public Object[][] dataset1(Method m)
	{
		 Object[][] testdata=null;
		 if(m.getName().equals("test"))
				{
			 testdata=new Object[][]
		{
			{"username1","password1"},
			{"username2","password2"},
			{"username3","password3"},
			{"username4","password4"}
			};
		}
		 else if(m.getName().equals("test1"))
		 {
			 testdata=new Object[][]
					 {
			{"username1","password1","test1"},
			{"username2","password2","test2"},
			{"username3","password3","test3"},
			{"username4","password4","test4"}
			};
		}
		 else if(m.getName().equals("test2"))
		 {
			 testdata=new Object[][]
					 {
			{"username1","password1","test1","f1"},
			{"username2","password2","test2","f2"},
			{"username3","password3","test3","f3"},
			{"username4","password4","test4","f4"}
			};
		}
		 
		return testdata;
		 
	}
	
	
	

}

