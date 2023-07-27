import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> names= new ArrayList<String>();
names.add("Preeti");
names.add("Jiya");
names.add("Pragya");
names.add("Sita");
names.add("Preethvi");
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
