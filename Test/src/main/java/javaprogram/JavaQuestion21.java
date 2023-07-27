package javaprogram;

import java.util.Scanner;

public class JavaQuestion21 {

	public static void main(String[] args) {
		//Print Reverse number in java program
		
		Scanner s= new Scanner(System.in);
		int num= s.nextInt();
		int reverseNum=0;
		for(int i=0;i<num;i++)
		{
		reverseNum= reverseNum*10+num%10;
		num=num/10;
		}
		System.out.println("Reverse number is : "+reverseNum );
		

	}

}
