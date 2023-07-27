import java.util.ArrayList;

import org.testng.annotations.Test;

public class arrayList {

	@Test
	public void Case() {
		ArrayList<String> names=new ArrayList<String>();
		names.add("Preeti");
		names.add("Preethvi");
		names.add("prrr");
	names.add("Eti");
	int count=0;
	
	for(String name:names)
	{
		if(name.startsWith("p"))
		{
			count++;
		}
	}
	System.out.println(count);
	}
}
