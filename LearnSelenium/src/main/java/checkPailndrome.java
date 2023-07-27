import java.util.Scanner;

public class checkPailndrome {

	public static void main(String[] args) {
		
		String a,b="";
		Scanner s=new Scanner(System.in);
		a=s.nextLine();
		int n=a.length();
		for(int i=n-1;i>=0;i--)
		{
			b=b+a.charAt(i);
			}
			if(a.equalsIgnoreCase(b))
			{
				System.out.println("String is palindrome");
				
			}
			else
			{
				System.out.println("String is not palindrome");
		}

	}

}
