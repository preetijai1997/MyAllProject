package com.wynk;

import java.time.Instant;
import java.util.ArrayList;

public class Subtract {
	
	int number1;
	int number2;
	public Subtract(int val1, int val2)
	{
		this.number1=val1;
		this.number2=val2;
	}
	static ArrayList<Subtract> al= new ArrayList<Subtract>();
	
	public static void main(String[] args) {
	 int result=subtractVal(50,23);
	 int result1=subtractVal(30,23);
	 int result2=subtractVal(50,23);
	 System.out.println("After subtract result is : "+ result);
	 System.out.println("After subtract result is : "+ result1);
	 System.out.println("After subtract result is : "+ result2);

	}
	
	public static int subtractVal(int input1, int input2)
	{
		
		int minus=0;
		boolean checkKeys=keyExist(input1, input2);
		if(!checkKeys)
		{
			long startTime= Instant.now().toEpochMilli();
			for(int i=0; i<200000;i++)
			{
				minus= input1- input2;
			}
			Subtract sub= new Subtract(input1, input2);
			long endTime= Instant.now().toEpochMilli();
			System.out.println("Execution time : " + (endTime- startTime) + " Start time is : "+startTime + "End Time is :" + endTime);
			return minus;
		}
		else
		{
			long startTime= Instant.now().toEpochMilli();
			long endTime= Instant.now().toEpochMilli();
			System.out.println("Execution time : " + (endTime- startTime) + " Start time is : "+startTime + "End Time is :" + endTime);
			return input1-input2;
		}
		
		
	}
	
	public static boolean keyExist(int key1, int key2)
	{
		for(int i=0; i<al.size();i++)
		{
			if(al.get(i).number1== key1 && al.get(i).number2==key2)
			{
				return true;
			}
		}
		return false;
		
	}

}
