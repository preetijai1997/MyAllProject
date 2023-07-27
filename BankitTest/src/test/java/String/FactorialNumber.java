package String;

public class FactorialNumber {

	public static void main(String[] args) {
		
		
		int n=4, fact=1;
		
		for(int i=1; i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of " +n+ " is "+ fact);
		
		if(n==0)
		{
		    System.out.println(1);
		}

	}

}
