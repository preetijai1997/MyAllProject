package com.airtel;

public class PrimeNumber {

	public static void main(String[] args) {
		boolean checkNum=PrimeNum(80);
		System.out.println("Number is prime or not : "+ checkNum );
		

	}
	
	public static boolean PrimeNum(int num)
	{
		if(num==0 || num==1)
		{
			return false;
		}
		
		else if(num==2)
		{
			return true;
			
		}
		
		for(int i=2; i<num/2; i++)
		{
			if(num%i==0)
			{
				return false;
			}
			
			
		}
		return true;
		
		
	}

}
