package com.airtel;

public class ArrayLargestNum {

	public static void main(String[] args) {
		int[] a= {4,8,2};
		
		int largeVal=largestNum(a);
		System.out.println("Largest value of array is : "+largeVal);

	}
	
	public static int largestNum(int [] a)
	{
		int maxVal=-4;
		for(int i=0; i<a.length;i++)
		{
		
			if(a[i]>maxVal)
			{
				maxVal=a[i];
			}
		}
		//System.out.println(maxVal);
		return maxVal;
	}

}
