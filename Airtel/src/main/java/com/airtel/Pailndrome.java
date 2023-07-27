package com.airtel;

public class Pailndrome {

	public static void main(String[] args) {
	
		boolean isPalindrome=checkPalindrome("absdca");
		System.out.println("String is palindrome or not : "+ isPalindrome);
	}
	
	public static boolean checkPalindrome(String s)
	{
		
		for(int i=0; i<s.length()/2;i++)
		{
			char a=s.charAt(i);
			char b=s.charAt(s.length()-i-1);
			
			if(a!=b)
			{
				return false;
			}
		}
		return true;
		
	}

}
