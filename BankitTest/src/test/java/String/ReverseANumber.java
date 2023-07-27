package String;

public class ReverseANumber {

	public static void main(String[] args) {
		
		
		int n=1234, reverse=0;
		
		while(n!=0)
		{
			reverse= reverse*10+n%10;
			n=n/10;
		}
		
		System.out.println("Reverse of 1234 is "+ reverse);

	}

}
