package com.airtel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListContainOddNum {

	public static void main(String[] args) {
		Integer[] a=new Integer[] {2,5,4,9};
		List<Integer> b=Arrays.asList(a);
		boolean checkOdd=listOfOddNum(b);
		System.out.println("Lis is odd or not : "+ checkOdd);
		
	}
	
	public static boolean listOfOddNum(List<Integer> li)
	{
//		List<Integer> li= new ArrayList<Integer>();
//		li.add(11);
//		li.add(33);
//		li.add(35);
		
		for(int i=0; i< li.size();i++)
		{
				Integer val=li.get(i);
				if(	li.get(i) %2==0)
				{
					return false;
				}
				
		}
		return true;
		
	}

}
 