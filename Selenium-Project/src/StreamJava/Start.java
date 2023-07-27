package StreamJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Start {
	@Test
	public void startLetter()
	
	{
		ArrayList<String> names=new ArrayList<String>();
		names.add("Preeti");
		names.add("Amrita");
		names.add("Jaan");
		names.add("Preeti");
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
		System.out.println("Name start with P :"+ count);
		
	}
	@Test
	public void streamFilter()

	{
		/*
		ArrayList<String> names=new ArrayList<String>();
		names.add("Preeti");
		names.add("Amrita");
	
		names.add("Jaan");
		names.add("Preeti");
		names.add("Preethvi");
		names.add("Pragati");
		names.add("Pooja");
		
		Long c=names.stream().filter(s->s.startsWith("P")).count();
		System.out.println(c);
		
		
		Long d=Stream.of("Preeti","Amrita","Jaan","Preeto","Preethvi","Pooja").filter(s->
		{
			s.startsWith("P");
			return false;
		}).count();
		System.out.println(d);
		
		//names.stream().filter(s->s.length()>5).forEach(s->System.out.println(s));
		//names.stream().filter(s->s.length()>5).limit(2).forEach(s->System.out.println(s));
		
		
		//Stream.of("Preeti","Amrita","Jaan","Preeto","Preethvi","Pooja").filter(s->s.length()>4).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		ArrayList<String> names2=new ArrayList<String>();
		names2.add("Preeti");
		names2.add("Amrita");
       names2.add("Jaan");
       
      /*List<String> names3= Arrays.asList("Poojs","Jiysa","Riya");
       
       
		//Stream.of("Preeti","Amrita","Aaya","Jaan","Preeto","Preethvi","Pooja").filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		Stream<String> newStream=Stream.concat(names2.stream(), names3.stream());
		//newStream.sorted().forEach(s->System.out.println(s));
		
		boolean flag=newStream.anyMatch(s->s.equalsIgnoreCase("Preeti"));
		System.out.println(flag);
	Assert.assertTrue(flag);
	*/
       
       List<Integer> ls=Arrays.asList(3,2,2,1,7,4,5,4);
      // ls.stream().distinct().forEach(s-> System.out.println(s));
       ls.stream().distinct().sorted().forEach(s->System.out.println(s));
       
       
	}
	
}
