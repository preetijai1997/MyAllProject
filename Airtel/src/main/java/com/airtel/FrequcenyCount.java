package com.airtel;

import java.util.ArrayList;

public class FrequcenyCount {
	int value;
	int  counting;
	
	public FrequcenyCount(int val, int count)
	{
		this.value=val;
		this.counting=count;
	}
	boolean isExist;
	int currentCount;
	int index;
	public FrequcenyCount(boolean isExist, int currentCount, int index)
	{
		this.isExist=isExist;
		this.currentCount=currentCount;
		this.index=index;
	}
	static ArrayList<FrequcenyCount> al= new ArrayList<FrequcenyCount>();
	public static void main(String[] args) {
		
   int a[]= {1,3,2,1,1,1,1};
   
  countFrequnc(a);
  for(int i=0;i<al.size();i++) {
	  System.out.println(al.get(i).value+" "+al.get(i).counting);
  }
 // System.out.println(counting);
   
	}
	
	
	public static void countFrequnc(int arr[])
	{
	
		for(int i=0; i<arr.length;i++)
		{
			int value=arr[i];
			FrequcenyCount val=isExist(arr[i]);
			
			if(val.isExist)
			{
		
		FrequcenyCount fq= new FrequcenyCount(arr[i],val.currentCount+1);
	al.remove(val.index);
	al.add(fq);
			}
			else {
				FrequcenyCount fq= new FrequcenyCount(arr[i],1);
				al.add(fq);
			}
}
		
	}
	
	public static FrequcenyCount isExist(int num)
	{
		FrequcenyCount fqc;
		for(int i=0;i<al.size();i++)
		{
			 //fqc= new FrequcenyCount();
			if(al.get(i).value==num)
			{
				fqc= new FrequcenyCount(true, al.get(i).counting,i);
				return fqc;
			}
		}
		return fqc=new FrequcenyCount(false,1,al.size()) ;
		
	
	}

}
