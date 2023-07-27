package com.airtel;

public class ReverseArray {

	public static void main(String[] args) {
		int[] a= {2,4,8,6};
		//int[] reverseArr=reverseArray(a);
		int[] reverseArr=reverseArrayWithoutSpace(a);
		for(int i=0;i<reverseArr.length;i++)
	{
		System.out.println(reverseArr[i]);
	}
		
		//reverseArray(a);

	}
	
	
	public static int[] reverseArray(int[] a)
	{
        int[] result=new int[a.length];
		int j=0;
		for(int i=a.length-1;i>=0;i--)
		{
		      result[j]=	a[i];
		      j++;
			//System.out.println(a[i]);
			    
		}
		
		
		return result;
		
	}
	
	public static int[] reverseArrayWithoutSpace(int[] a)
	{
		
		for(int i=0; i<a.length/2; i++)
		{
		     	int temp=a[i];
		     	a[i]=a[a.length-1-i];
		     	a[a.length-1-i]=temp;
		}
		return a;
		
	}

}
