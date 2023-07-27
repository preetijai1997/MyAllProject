package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetPractice {

	public static void main(String[] args) {
		
		
		Set<String> set= new HashSet<String>();
		
		set.add("Preeti Jaiswal");
		set.add("Sita");
		set.add("rajesh");
		set.add("Preeti Jaiswal");
		set.add("somya");
		
	Iterator<String> itr=set.iterator();
	
	while(itr.hasNext())
	{
          System.out.println( itr.next());
	}
		

	}

}
