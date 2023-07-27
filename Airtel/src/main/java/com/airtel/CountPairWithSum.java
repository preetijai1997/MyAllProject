package com.airtel;

public class CountPairWithSum {

	public static void main(String[] args) {
		int[] a= {1,5,7,-1};
		int Count=countPairSum(a,6);
		System.out.println(Count);
		
	}
	
	
	public static int countPairSum(int[] a, int Sum)
	{
	int count=0;
		
		for(int i=0;i<a.length;i++)
		{
			
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==Sum)
				{
					count++;
					
				}
				
			}
			
		}
		return count;
		
		
		
	}
}
