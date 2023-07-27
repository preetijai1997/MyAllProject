package javaprogram;

import java.util.Scanner;

public class JavaQuestion25 {

	public static void main(String[] args) {
		// Check Given No is palindrome or Not in java Program
		/*
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string : ");
		String originalString=sc.nextLine();
		String reverseString=" ";
		int length=originalString.length();
		
		for(int i=length-1; i>=0;i--)
		
			reverseString= reverseString+originalString.charAt(i);
			if(originalString.equals(reverseString))
			
				System.out.println("Entered string is palindrom");
			
			
			else
			
				System.out.println("Entered string are not palindrom");
			
		
		
		
	}
*/
	
		 String original, reverse = "";
		 Scanner in = new Scanner(System.in);
		 System.out.println("Enter a string to check if it is a palindrome");
		 original = in.nextLine();
		 int length = original.length();
		 for ( int i = length - 1; i >= 0; i-- )
		 reverse = reverse + original.charAt(i);
		 if (original.equals(reverse))
		 System.out.println("Entered string is a palindrome.");
		 else
		 System.out.println("Entered string is not a palindrome.");
		 }
		
	}

