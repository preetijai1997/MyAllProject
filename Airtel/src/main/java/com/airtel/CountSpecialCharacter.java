package com.airtel;

public class CountSpecialCharacter {

	public static void main(String[] args) {
		
		
		countSpecialChar("PrePeti$%Jaiswal");
		

	}
	
	public static void countSpecialChar(String s)
	
	{
		int count=0;
		for( int i=0; i<s.length();i++)
		{
			int a=(int)s.charAt(i);
			if(!((a>=48 && a<=57) || (a>=65 && a<=90) || (a>=97 && a<=122)))
			{
				count++;
				
			}
		}
		System.out.println("Special char is : "+ count +" "+ s.length());
	}

}
