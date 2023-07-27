package javaprogram;

import java.util.Scanner;

public class JavaQuestion5 {

	public static void main(String[] args) {
		//Write a Java program to reverse the element of an integer 1-D array.

		
		Scanner sc= new Scanner(System.in);
		int len=sc.nextInt();
		int[] a= new int[len];
		
		for(int i=0;i<len;i++)
		{
			a[i]=sc.nextInt();
		}
		reverseOder(a,len);
	}
	public static void reverseOder(int[] arr, int n)
	{
		for(int i=n-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
	}

}
