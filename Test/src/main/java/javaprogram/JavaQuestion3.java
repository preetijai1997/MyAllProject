package javaprogram;

import java.util.Scanner;

public class JavaQuestion3 {

	public static void main(String[] args) {

		// Write a program that creates an array of 10 elements size. Your program
		// should prompt the user to input numbers in array and then display the sum of
		// all array elements.

		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int[] a = new int[len];
		
		for(int i=0;i<len;i++)
		{
		   
		   a[i]=sc.nextInt();
		}

		sumOfArray(a, len);
	}

	public static void sumOfArray(int[] arr, int n) {
		int sum = 0;
		for (int i = 0; i < n; i++) {
			
			sum = sum + arr[i];
			
		}
		System.out.println(sum);
	}
}
