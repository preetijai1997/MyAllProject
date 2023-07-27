import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class p_dataprovider {

	@Test(dataProvider="getData")//3-dataProvider has to be mentioned with the name of the method inside the DataProvider annotation
	public void DataMatrix(String UserName, String Password, int SecurityCode)//4- No. of input parameter inside the method-number of columns in the DataProvider Object Array
	{
		
	}
	
	@DataProvider
	//1- return 2 dimensional array
	//2- rows and columns you have to specify
	public Object[][] getData()
	{
		Object[][] data=new Object[2][3];
		
		data[0][0]="UserName";
		data[0][1]="Password";
		data[0][2]=123;
		
		data[1][0]="UserName1";
		data[1][1]="Password2";
		data[1][2]=124;
		
		
		
		return data;
		
}
}
