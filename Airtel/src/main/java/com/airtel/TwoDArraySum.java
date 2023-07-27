package com.airtel;

public class TwoDArraySum {

	public static void main(String[] args) {
		
		int[][]a= {{2,3,1},{4,1,2},{2,3,4}};
		
		sumOfRow(a);
		sumOfCol(a);

	

	reverseMatrixEle(a);

	}
	
	public static void sumOfRow(int[][] a)
	{
		for(int i=0; i<a.length;i++)
		{
			int sum=0;
				for(int j=0; j<a.length;j++)
			{
					
					sum=sum+a[i][j];								
				}
				System.out.print(sum+" ");
				
			}
	}
	
	public static void sumOfCol(int[][]a)
	{
		for(int i=0; i<a[0].length;i++)
		{
			int sum=0;
			for(int j=0;j<a.length;j++)
			{
				sum=sum+a[j][i];
			}
			
			System.out.print(sum+" ");
		}
	}

	public static void reverseMatrixEle(int[][]a)
	{
		for(int i=a[0].length-1;i>=0;i--)
		{
			for(int j=a.length-1;j>=0;j--)
			{
				
				System.out.print(a[i][j]+ " ");
			}
			System.out.println(" ");
		}
	}

}
