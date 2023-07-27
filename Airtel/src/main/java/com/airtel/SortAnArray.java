package com.airtel;

public class SortAnArray {

	public static void main(String[] args) {
		int[] a= {2,1,7,9,0,2,3,6};
		sortArray(a);

	}
	public static void sortArray(int[] a)
	{
		
		for(int i=0; i<a.length;i++)
		{
			for(int j=i+1; j<a.length;j++)
			{
				int temp;
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.println(a[i]);
		}
	}

}
