package javaprogram;

import java.util.Scanner;

public class JavaQuestion10 {

	public static void main(String[] args) {
		//How to swap 2 no without using 3rd variable Program in java

		Scanner s= new Scanner(System.in);
		
		int a= s.nextInt();
		int b= s.nextInt();
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("Swap of two element are :" + a + " "+ b);

	}

}
