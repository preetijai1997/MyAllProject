package javaprogram;

import java.util.Scanner;

public class JavaQuestion26 {

	public static void main(String[] args) {
		// How to compare 2 string in java Program
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first string : ");
		String frstString=sc.nextLine();
		System.out.println("Enter second string : ");
		String secondString=sc.nextLine();
		System.out.println("Enter third string : ");
		String thirdString=sc.nextLine();
		System.out.println("Enter fourth string : ");
		String fourthString=sc.nextLine();
		
		if(frstString.equals(fourthString))
		{
			System.out.println("First string and fourth string are equal");
		}
		else if(!frstString.equals(fourthString))
				{
			System.out.println("First string and fourth string are not equal");
				}
		
		else if(frstString.equals(secondString))
		{
			System.out.println("First string and second string are equal");
		}
		
		else if(!frstString.equals(secondString))
		{
			System.out.println("First string and second string are not equal");
		}
		else if(frstString.equals(thirdString))
		{
			System.out.println("First string and third string are equal");
		}
		
		else if(!frstString.equals(thirdString))
		{
			System.out.println("First string and third string are not equal");
		}
		
		

	}

}
