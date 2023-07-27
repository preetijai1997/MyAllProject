package javaprogram;

import java.util.Scanner;

public class JavaQuestion6 {

	public static void main(String[] args) {
		
		//Write a Java program to find the largest and smallest element of an array.
		
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int[] a=new int[n];
		
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		
		int largeNumber= largeNum(a,n);
		System.out.println("Larger number is : "+ largeNumber);
		
		int smallestNumber=smallestNum(a,n);
		System.out.println("Smallest number is : "+smallestNumber );
		}
	
	public static int largeNum(int[] arr, int l1)
	{
		int temp= Integer.MIN_VALUE;
		
		for(int i=0;i<l1;i++)
		{
			if(arr[i]>temp)
			{
				temp=arr[i];
			}
		}
		return temp;	
	}
	
	public static int smallestNum(int[] arr,int l2)
	{
		
		int temp=Integer.MAX_VALUE;
		
		for(int i=0;i<l2;i++)
		{
			if(arr[i]<temp)
			{
				temp=arr[i];
			}
		}
		return temp;
		
	}
}
