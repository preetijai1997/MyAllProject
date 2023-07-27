package com.airtel;

public class FactorialOfNum {

	public static void main(String[] args) {
		//int num;
		int factOfNum=factNum(3);
		System.out.println("factorial of 3 is "+factOfNum);
	}
	
	public static int factNum(int num)
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		
		}
		return fact;
	}

}
