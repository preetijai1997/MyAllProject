package javaprogram;

import java.util.Scanner;

public class JavaQuestion4 {

	public static void main(String[] args) {
	//The variable list1 and list2 are reference arrays that each have 5 elements. Write code that copies the values in list1 to list2. Values in list1 are input by user.
		 final int SIZE = 5;
		Scanner s1= new Scanner(System.in);
		//int len1=s1.nextInt();
		int[] list1= new int[SIZE];
		
		Scanner s2= new Scanner(System.in);
		//int len2=s2.nextInt();
		int[] list2= new int[SIZE];
		
		
		for(int i=0;i<SIZE;i++)
		{
			list1[i]= s1.nextInt();
		}
		
		for(int i=0;i<SIZE;i++)
		{
			list2[i]=list1[i];
		}
		
		for(int i=0;i<SIZE;i++)
		{
			System.out.println("List 2 elements are : "+ list2[i]);
		}
}

}