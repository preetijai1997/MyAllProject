import java.util.ArrayList;
import java.util.Iterator;

public class ArratListJava {

	public static void main(String[] args) {
		
		
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("Preeti");
		list.add("Jaiswal");
		list.add("Preeti");
		list.add("Preeti");
		list.add("Preeti");
		Iterator itr= list.iterator();
		while(itr.hasNext())
		{
			System.out.println(" Elements are : "+ itr.next());
		}

	}

}
