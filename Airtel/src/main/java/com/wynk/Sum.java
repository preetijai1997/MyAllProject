package com.wynk;

import java.time.Instant;
import java.util.ArrayList;

public class Sum {
	int num1;
	int num2;
	
	public Sum( int a, int b)
	{
		this.num1= a;
		this.num2=b;
	}

 static ArrayList<Sum> al= new ArrayList<Sum>();	
	public static void main(String[] args)
	{
		int addValue=sumOfTwoNum(3,4);
		int addValue1=sumOfTwoNum(60,4);
		int addValue2=sumOfTwoNum(3,4);
		System.out.println("Addition after result is : "+ addValue);
		System.out.println("Addition after result is : "+ addValue1);
		System.out.println("Addition after result is : "+ addValue2);
		
	}
	
	public static int sumOfTwoNum(int val1 , int val2)
	{
		
		int sum=0;
		boolean numberPresent=isExist(val1, val2);
		
		if(!numberPresent)
		{
			long sstartTime= Instant.now().toEpochMilli();
			for(int i=0; i<1008900;i++)
			{
				
		sum= val1+val2;
			}
			long endTime= Instant.now().toEpochMilli();
			Sum s= new Sum(val1, val2);
			System.out.println("Time of exection is : " + (endTime - sstartTime) +" " + sstartTime + " "+  endTime );
		return sum;
		
		}
		
		else
		{
			long sstartTime= Instant.now().toEpochMilli();
			long endTime= Instant.now().toEpochMilli();
			System.out.println("Time of exection is : " + (endTime - sstartTime) +" " + sstartTime + " "+  endTime );
			return val1+val2;
		}
	}
	
	
	public static boolean isExist(int input1, int input2)
	{
		for(int i=0; i<al.size();i++)
		{
			if(al.get(i).num1==input1 && al.get(i).num2==input2)
			{
				return true;
			}
		}
		return false;
		
	}
}
