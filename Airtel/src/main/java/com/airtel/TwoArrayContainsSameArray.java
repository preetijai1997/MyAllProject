package com.airtel;

public class TwoArrayContainsSameArray extends BubbleSort{

	public static void main(String[] args) {
		int[] a= {3,5,1,4};
		int[] b= {1,3,5};
		int[] p=sortArray(a);
		int[]q=sortArray(b);
		boolean isSame=containsSameArray(p,q);
		System.out.println(isSame);

	}
	
	public static boolean containsSameArray(int[] a, int [] b)
	{
		if(a.length==b.length)
		{
		for(int i=0;i<a.length;i++)
		{
			
		 if(a[i]==b[i])
		{
			
			return true;
		}
		}
		}
		return false;
		
	}

}
