package com.airtel;

public class FindVowelInString {

	public static void main(String[] args) {
		StringVowel("Pooja");
		//System.out.println("Vowel letter in name is : "+ name);

	}
	
	public static void StringVowel(String str)
	{
		for(int i=0; i<str.length();i++)
		{
			if(str.charAt(i)=='a'|| str.charAt(i)=='e'|| str.charAt(i)=='i' || str.charAt(i)=='o'|| str.charAt(i)=='u')
			{
				System.out.println(str.charAt(i));
			}
		}
		
		
	}
}
