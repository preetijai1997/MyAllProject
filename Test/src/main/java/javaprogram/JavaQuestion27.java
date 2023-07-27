package javaprogram;

import java.util.Scanner;

public class JavaQuestion27 {

	public static void main(String[] args) {
		// How to string ends with specific char in java Program
      Scanner s= new Scanner(System.in);
      System.out.println("Enter string : ");
      String str= s.nextLine();
      System.out.println("Compare last string ");
      String inputLastString=s.nextLine();
      
      if(str.endsWith(inputLastString))
      System.out.println("Last string is match with the entered string");
      
      else
    	  System.out.println("Last string is not match with the entered string");
		
		
	}

}
