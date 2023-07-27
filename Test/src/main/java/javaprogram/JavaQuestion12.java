package javaprogram;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaQuestion12 {

	public static void main(String[] args) {
		//Find Largest element in Array
		
		Scanner s= new Scanner(System.in);
		
		int len=s.nextInt();
		ArrayList<Integer> al= new ArrayList<Integer>();
		
		for(int i=0;i<len;i++)
		{
			int num=s.nextInt();
			al.add(num);
		}
		
		
	int largeVal=largeNum(al,len);
	System.out.println(largeVal);
	}
	
	public static int largeNum(ArrayList<Integer> a, int n)
	{
		int temp= Integer.MIN_VALUE;
		
		for(int i=0;i<n;i++)
		{
			if(a.get(i)>temp)
			{
				temp=a.get(i);
			}
		}
		
		return temp;
		
	}

}
