import java.util.ArrayList;

public class Test1 {
	@Test	

	
	public void regular()
	{
		ArrayList<String> names=new ArrayList<String>();
		names.add("Preeti");
		names.add("Juhi");
		names.add("Pragati");
		names.add("Preethvi");
		names.add("Preeti");
		
		int count=0;
		for(int i=0;i<names.size();i++)
		{
			String name=names.get(i);
			if(name.startsWith("P"))
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
