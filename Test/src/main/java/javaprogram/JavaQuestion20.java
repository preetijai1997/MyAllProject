package javaprogram;

import java.util.Scanner;

public class JavaQuestion20 {

	public static void main(String[] args) {
		//Print Reverse array in java program
		
		Scanner s= new Scanner(System.in);
		int len=s.nextInt();
		int[] a= new int[len];
		
		for(int i=len-1;i>=0;i--)
		{
			System.out.println("Reverse oder is "+ a[i]);
		}

	}

}
