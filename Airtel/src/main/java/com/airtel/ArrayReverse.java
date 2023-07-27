package com.airtel;

public class ArrayReverse {

	public static void main(String[] args) {
		int[] a1= {2,3,4};
		arrayReverse(a1);
		
	}
	
	public static void arrayReverse(int[] a)
	{
	
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
	}

}
