package javaprogram;

import java.util.Scanner;

public class JavaQuesion15 {

	public static void main(String[] args) {
		//  How to check Odd and Even Number 
		
		Scanner s= new Scanner(System.in);
		
		int num=s.nextInt();
		
		if(num%2==0)
		{
			System.out.println("Number is even "+ num);
		}
		
		else
		{
			System.out.println("Number is odd "+ num);
		}
		
		

	}

}
