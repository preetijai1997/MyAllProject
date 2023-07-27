package com.airtel;

import java.time.Instant;
import java.util.ArrayList;

public class SubstractionOfTwoNum  {
	
	int num1;
	int num2;
	public SubstractionOfTwoNum(int n1, int n2)
	{
		this.num1=n1;
		this.num2=n2;
	}
 static ArrayList<SubstractionOfTwoNum> al= new ArrayList<SubstractionOfTwoNum>();
	public static void main(String[] args) {
		int minus=subTract(3,1);
		int minus1=subTract(2,1);
		int minus2=subTract(3,1);
		System.out.println(minus);
		System.out.println(minus1);
		System.out.println(minus2);

	}
	
	
	public static int subTract(int val1, int val2)
	{
		int sub=0;
		SubstractionOfTwoNum subtract;
		
		boolean existance=isExist(val1, val2);
		      if(!existance)
				{
		    	  long startTime = Instant.now().toEpochMilli();
		    		for(int i=0;i<=100000000;i++)
					{
			
			 sub= val1- val2;
					}
			 subtract= new SubstractionOfTwoNum(val1, val2);
			al.add(subtract);
			 long endTime = Instant.now().toEpochMilli();
			 System.out.println(endTime-startTime+ "Time" + startTime +" " + endTime);
			return sub;
		
		}
						
		else
		{
			long startTime = Instant.now().toEpochMilli();
			long endTime = Instant.now().toEpochMilli();
			 System.out.println(endTime-startTime+ "Time" + startTime + " "+ endTime);
			//System.out.println("2222222222222");
		return val1-val2;
		}
	}
	
		//return val2;
		
		
	
	
	
	public static boolean isExist(int n1, int n2)
	{
		for(int i=0; i<al.size();i++)
		{
			if(al.get(i).num1==n1 && al.get(i).num2==n2)
			{
				return true;
			}
		}
		return false;
	}
}
