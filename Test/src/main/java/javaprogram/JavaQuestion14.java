package javaprogram;

import java.util.Scanner;

public class JavaQuestion14 {

	public static void main(String[] args) {
		// Nested If Else clause in java
		
		Scanner s= new Scanner(System.in);
		
		int obtainedMarks=s.nextInt();
		
		int passingMarks=s.nextInt();
		
		if(obtainedMarks<passingMarks)
		{
			System.out.println("Fail");
		}
		
		else if(obtainedMarks==passingMarks)
		{
			System.out.println("Just Passed");
		}
		
		else
		{
			System.out.println("Pass");
		}
	
	}

}
