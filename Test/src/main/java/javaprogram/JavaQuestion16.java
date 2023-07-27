package javaprogram;

import java.util.Scanner;

public class JavaQuestion16 {
	
	//Find factorial for given no Program in Java
	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		//int num=s.nextInt();
		
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of num is "+ fact);
		
	}

}
