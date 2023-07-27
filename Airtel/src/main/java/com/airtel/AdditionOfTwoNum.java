package com.airtel;

import java.util.ArrayList;

public class AdditionOfTwoNum {
	
	int n1;
	int n2;
	int result;
	
	public AdditionOfTwoNum(int n1, int n2, int result)
	{
		this.n1=n1;
		this.n2=n2;
		this.result=result;
	}
static ArrayList<AdditionOfTwoNum> al= new ArrayList<AdditionOfTwoNum>();
	public static void main(String[] args) {
		int sumOfTwoNum=addTwoNum(3,4);
		int sumOfTwoNum1=addTwoNum(5,4);
		int sumOfTwoNum2=addTwoNum(2,4);
		int sumOfTwoNum3=addTwoNum(3,4);
		System.out.println(sumOfTwoNum);
		System.out.println(sumOfTwoNum1);
		System.out.println(sumOfTwoNum2);
		System.out.println(sumOfTwoNum3);
		

	}
	
	public static int addTwoNum(int n1, int n2)
	{
		int sum=0;
		boolean numExist=isNumExist(n1,n2);
		if(!numExist)
		{
		for(int i=0;i<10;i++)
		{
			sum=n1+n2;
		}
		
		AdditionOfTwoNum a= new AdditionOfTwoNum(n1, n2, sum);
		al.add(a);
		return sum;
		}
		else
		{
			return sum=n1+n2;
		}
		
	}
	
	
	public static boolean isNumExist(int num1, int num2)
	{
		for(int i=0;i<al.size();i++)
		{
			if(al.get(i).n1==num1 && al.get(i).n2==num2)
			{
				return true;
			}
		}
		return false;
	}

}
