package com.airtel;

import java.util.ArrayList;

public class CountFreq {
	int num;
	int count;
	public CountFreq(int num, int count)
	{
		this.num=num;
		this.count=count;
	}
	boolean exist;
	int cC;
	int i;
	public CountFreq(boolean existance, int currentCount, int index)
	
	{
		this.exist=existance;
		this.cC=currentCount;
		this.i=index;
	}
     static ArrayList<CountFreq> al= new ArrayList<CountFreq>();
	public static void main(String[] args) {
		int [] a= {2,3,4,5,1,3};
		countValue(a);
		for(int i=0; i<al.size();i++)
		{
			System.out.println(al.get(i).num + " "+ al.get(i).count);
		}
	}
	
	
	public static void countValue(int arr[])
	{
		for(int i=0; i<arr.length;i++)
		{
			int value=arr[i];
			CountFreq count=isExist(arr[i]);
			if(count.exist)
			{
				CountFreq cf= new CountFreq(value,count.cC+1);
				//al.remove(count.i);
				al.set(count.i,cf);
				//al.add(cf);
				
			}
			
			else
			{
				CountFreq cf= new CountFreq(arr[i], 1);
				al.add(cf);
			}
		}
		
	}
	
	public static CountFreq isExist(int num)
	{
		CountFreq cf;
		for(int i=0; i<al.size();i++)
		{
			if(al.get(i).num==num)
			{
				return cf= new CountFreq(true, al.get(i).count, i);
				
			}
		}
		return cf= new CountFreq(false,1,al.size());
	}

}
