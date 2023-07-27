package javaprogram;

import java.util.Scanner;

public class JavaQuestion19 {

	public static void main(String[] args) {
		//While loop Program in java
		
		Scanner s=new Scanner(System.in);
		int len=s.nextInt();
		
		while(len!=0)
		{
			System.out.println("Enter a number ");
			System.out.println("Number is "+ s.nextInt());
		}
		
		System.out.println("Not a number");


	}

}
