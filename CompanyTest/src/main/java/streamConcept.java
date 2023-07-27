import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;


public class streamConcept {

	/*
	 * 1)
	@Test
	public void regular()
	{
	ArrayList<String> names= new ArrayList<String>();
	names.add("pm");
	names.add("Preeti");
	names.add("Akhil");
	names.add("Priya");
	names.add("Alaya");
	names.add("Vibha");
	
	
	Long a=names.stream().filter(s->s.startsWith("A")).count();
	System.out.println(a);
	

	
	Long d=Stream.of("Abhijeet","Alekhya").filter(s->{
		s.startsWith("A");
		return true;
	}).count();	
	System.out.println(d);
	//names.stream().filter(s->s.length()>3).forEach(s->System.out.println(s));
	names.stream().filter(s->s.length()>3).limit(1).forEach(s->System.out.println(s));
	}

2)
	@Test
	public void b()
	{
		Stream.of("Abhijeet","Alekhya","Raja","Rekha","Rajesh").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	}
	

3)		
@Test
public void c()
{
	Stream.of("Preeti","Sita","Ajay","Gaurav","Jyoti","Rajesh","Amrit","Amit").filter(s->s.startsWith("A")).sorted().forEach(s->System.out.println(s));
}


@Test
public void d()
{
	 List<String> name= Arrays.asList("List","Vindi","Pitu","Peetu");
	 
	 List<String> name1= Arrays.asList("Jeet","Meet","Preet");
	 Stream<String> newStream=Stream.concat(name.stream(), name1.stream());
	  
	// newStream.sorted().forEach(s->System.out.println(s));
	 
	 
	 boolean a=newStream.anyMatch(s->s.equalsIgnoreCase("Jeet"));
	 Assert.assertTrue(a);
}

*/
@Test
public void e()
{
//List<String> ls=	Stream.of("Abhijeet","Alekhya","Raja","Rekha","Rajesh").filter(s->s.startsWith("A")).map(s->s.toUpperCase())
//	.collect(Collectors.toList());
	
//System.out.print(ls);

 List<Integer> i= Arrays.asList(3,2,1,2,4,3);
 
   List<Integer> i1= i.stream().distinct().sorted().collect(Collectors.toList());
   System.out.println(i1.get(3));
   

	
}
}
