package String;

public class Counting {

	public static void main(String[] args) {
		int counting=countChar("preeti",'e');
		System.out.println("Counting of 'e' is "+ counting);

	}

	
	public static int countChar(String s, char c)
	{
		
		String name="Preeti";
		char val='e';
		int count=0;
		
		for(int i=0; i<name.length();i++)
		{
			char value=name.charAt(i);
			if(value==val)
			{
				count++;
			}
			
		}
		return count;
		
	}
}
