package String;

public class ReverseString {

	public static void main(String[] args) {
	String name=	nameReverse();
	System.out.println("name is : "+ name);

	}
	
	public static String nameReverse()
	{
		
		String s="preeti";
		String n="";
		
		for(int i=0;i<s.length();i++)
		{
			char name=s.charAt(i);
			n=name+n;
		}
		
		return n;
		
	}

}
