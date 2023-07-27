package javaprogram;

import java.util.Scanner;

public class JavaQuestion9 {

	public static void main(String[] args) {
		//How to swap 2 no using 3rd variable Program 
		
		Scanner s= new Scanner(System.in);
		
		
	  int temp;

	  int a= s.nextInt();
	  int b=s.nextInt();
	  
	  temp=a;
	  a=b;
	  b=temp;
	  
	  System.out.println("Element are : "+ a + " "+ b);

	}

}