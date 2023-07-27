package com.airtel;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		int [][] a= {{2,3,4},{1,2,3}};
		int Sum=sumOfArray(a);
		//System.out.println("Sum is: "+ Sum);
		
		boolean isPresent=findTargetEle(a,4);
		System.out.println("Elemesnt is present or not : "+isPresent );
		
	}
	
	
	public static int sumOfArray(int[][] a)
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
		
			
			for(int j=0;j<a.length+1;j++)
			{
				
				sum+=a[i][j];
			}
			
			}
		return sum;
		
		
	}
	
	public static boolean findTargetEle(int [][]a , int targetEle)
	{
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0; j<a.length+1;j++)
			{
				if(a[i][j]==targetEle)
				{
					return true;
				}
			}
		}
		return false;
	}

}
