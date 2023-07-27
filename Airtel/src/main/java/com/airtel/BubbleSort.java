package com.airtel;

public class BubbleSort {

	public static void main(String[] args) {
		
         int[] a= {-1,2,2,5,1,3,0,-2,-5};
      int[] Sort= sortArray(a);
      for(int i=0; i<Sort.length;i++)
      System.out.print(" "+Sort[i]);
	}

	public static int[] sortArray(int[] a)
	{
		
		for(int i=0; i<a.length;i++)
		{
			for(int j=i+1; j<a.length;j++)
			{
				
				if(a[i]>a[j])
				{
		           int temp=a[i];
		           a[i]=a[j];
		           a[j]=temp;
				}
			}
		}
		//for(int i=0;i<a.length;i++)
		//System.out.print(" "+a[i]);
		return a;
	}
}
