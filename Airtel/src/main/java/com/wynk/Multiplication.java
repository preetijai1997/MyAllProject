package com.wynk;

import java.time.Instant;
import java.util.ArrayList;

public class Multiplication {
	
	int value1;
	int value2;
	public Multiplication(int val1, int val2)
	{
		this.value1= val1;
		this.value2=val2;
	}
  static ArrayList<Multiplication> al= new ArrayList<Multiplication>();
	public static void main(String[] args) {
		int Multiply=multiPlication(2,8);
		int Multiply1=multiPlication(4,8);
		int Multiply2=multiPlication(2,8);
		System.out.println(Multiply);
		System.out.println(Multiply1);
		System.out.println(Multiply2);

	}
	
	
	public static int multiPlication( int input1, int input2)
	{
		
		int mul=0;
		
		boolean checkNum=isExist(input1, input2);
		
		if(!checkNum)
		{
			long startTime= Instant.now().toEpochMilli();
			for(int i=0;i<300000;i++)
			{
				mul=input1*input2;
			}
			Multiplication mult= new Multiplication(input1, input2);
			long endTime= Instant.now().toEpochMilli();
			System.out.println("Execution time : " + (endTime- startTime) + " Start time is : "+startTime + "End Time is :" + endTime);
			return mul;
		}
		
		else
		{
			long startTime= Instant.now().toEpochMilli();
			long endTime= Instant.now().toEpochMilli();
			System.out.println("Execution time : " + (endTime- startTime) + " Start time is : "+startTime + "End Time is :" + endTime);
			return input1* input2;
		}
		
		
	}
	
	public static boolean isExist(int value1, int value2)
	{
		for(int i=0; i<al.size();i++)
		{
			if(al.get(i).value1==value1 && al.get(i).value2==value2)
			{
				return true;
			}
		}
		return false;
	}

}
