package javaprogram;

import java.util.Arrays;
import java.util.Scanner;

public class JavaQuestion7 {

	public static void main(String[] args) {
		// Search the element within array given by user
		
		Scanner s= new Scanner(System.in);
		int len= s.nextInt();
		int[] a= new int[len];
		
		for(int i=0;i<len;i++)
		{
			a[i]=s.nextInt();
		}
		int checkVal=6;
		 System.out.println("Array: "
                 + Arrays.toString(a));

		check(a, checkVal);

	}
	
	public static void check(int[] arr, int checkValue)
	{
		boolean Value=Arrays.asList(arr).contains(checkValue);
		System.out.println("Is "+ checkValue +" Present in the array "+ Value);	
	}

}
