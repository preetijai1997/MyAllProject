package com.airtel;

public class MissingNumber {

	public static void main(String[] args) {
		int []a = {4,5,6,8};
		int val=missingInteger(a,4);
		System.out.println(val);

	}
	
	public static int missingInteger(int[] a, int n)
	{
		
		int sum=0;
		int sumOfN= n*(n+1)/2;
		
		for(int i=0;i<n-1;i++)
		{
			sum+= a[i];
		}
		return sumOfN-sum;
		
		
	}

}
