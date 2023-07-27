package javaprogram;

import java.util.Scanner;

public class JavaQuestion24 {

	public static void main(String[] args) {
		//Prime Number
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int m, flag=0;
		int i=2;
		m=n/2;
		if(n==0 || n==1)
		{
			System.out.println(n + " not prime number");
		}
		
		else
		{
			for( i=2; i<=m;i++)
			{
				if(n%i==0)
				{
					System.out.println(n + " not prime number");
					flag=1;
					break;
				}
			}
			if(n%i!=0)
			{
				System.out.println(n + " is a prime number");
			}

		}
		
	}

}
