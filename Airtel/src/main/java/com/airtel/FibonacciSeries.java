package com.airtel;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		fiboNacciSeries(4);
	}
	
	public static void fiboNacciSeries(int numCount)
	{
		int n1=1, n2=2, n3;
		
		System.out.println(n1 +" "+ n2);
		for(int i=2;i<=numCount;i++)
		{
			
			
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
		
		}
		
		
		
		
	}

}
