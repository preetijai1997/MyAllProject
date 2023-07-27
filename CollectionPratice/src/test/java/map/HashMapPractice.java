package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMapPractice {

	public static void main(String[] args) {
		
		Map<String , String> map= new HashMap<String , String>();
		
		map.put("name", "preeti jaiswal");
		map.put("designation", "software tester");
		map.put("company name", "Bankit service private limited");
		
		
		Set<String> keys=map.keySet();
		
		for(  String key:keys)
		{
			System.out.println("Key is --> "+ key+ " and  value is --> "+ map.get(key));
		}
		
		
		Map<String, List<String>> map1= new HashMap<String, List<String>>();
		
		List<String> emails= new ArrayList<String>();
		emails.add("preetijaiswal504@gmail.com");
		emails.add("somyajaiswal@gmail.com");
		emails.add("jyotijaiswal@gmail.com");
		
		map1.put("test", emails);
		
		Set<String> keys1=	map1.keySet();
		
		for(String key:keys1)
		{
			System.out.println("Key is --> "+ key+ " and  value is --> "+ map1.get(key));
		}
		
		
		
		
		
		

	}

}
