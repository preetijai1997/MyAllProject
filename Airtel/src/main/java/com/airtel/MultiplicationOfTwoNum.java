package com.airtel;

import java.util.ArrayList;

public class MultiplicationOfTwoNum {
	int num1;
	int num2;
	int result;
	public MultiplicationOfTwoNum(int num1, int num2,int result)
	{
	    this.num1=num1;
	    this.num2=num2;
	    this.result=result;
	}
	
	static ArrayList<MultiplicationOfTwoNum> list=new ArrayList<MultiplicationOfTwoNum>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int value=multiplication(2,3);
		//MultiplicationOfTwoNum mult= new MultiplicationOfTwoNum(2,3,value);
		int value1=multiplication(3,5);
		int value2=multiplication(6,7);
		int value3=multiplication(2,3);
//		for(int i=0;i<list.size();i++)
//		{
//		System.out.println(list.get(i).num1+" "+list.get(i).num2+" "+list.get(i).result);
////		System.out.println(list.get(i).num1);
////		System.out.println(list.get(i).num1);
//		
//		}
		System.out.println("multiplication is " + value  );
		System.out.println("multiplication is " + value1  );
		System.out.println("multiplication is " + value2  );
		System.out.println("multiplication is " + value3  );
	}
	
	
	public static int multiplication(int n1, int n2)
	{
		int mul = 0;
		boolean isExist=isNumExists(n1,n2);
		if(!isExist)
		{
			System.out.println("000000000");
		for(int i=1;i<=10;i++)
		{
		mul  =n1*n2;
		}
		
		MultiplicationOfTwoNum mult= new MultiplicationOfTwoNum(n1,n2,mul);
		
		list.add(mult);
		
		return mul;
		}
		else
		{
			System.out.println("1111111111111111111");
			return n1*n2;
		}
		
	
		
		
	
	}
	
	public static boolean isNumExists(int num1, int num2)
	{
		for(int i=0;i<list.size();i++)
		{
			
			if(list.get(i).num1==num1 && list.get(i).num2==num2 )
			{
				return true;
			}
		}
		return false;
		
	}

}
