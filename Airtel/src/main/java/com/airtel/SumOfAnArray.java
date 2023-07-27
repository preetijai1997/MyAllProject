package com.airtel;

import java.util.ArrayList;

public class SumOfAnArray {

	public static void main(String[] args) {
		int [] a= {2,3,5,1};
		int sum=sumOfAnArray(a);
		System.out.println("Sum of array is : "+ sum);
		
		ArrayList<Integer> al= new ArrayList<Integer>();
		al.add(3);
		al.add(5);
		al.add(1);
		int value=sumArray(al);
		System.out.println("Sum of arraylist value is : "+ value);

	}
	
	public static int sumOfAnArray(int [] a)
	{
		int sum=0;
		
		for(int i=0; i<a.length;i++)
		{
			sum+=a[i];
		}
		return sum;
	}
	
	public static int sumArray(ArrayList<Integer> a)
	{
		int sum=0;
		
		for(int i=0;i<a.size();i++)
		{
			sum= sum+a.get(i);
		}
		
		return sum;
		
	}

}
