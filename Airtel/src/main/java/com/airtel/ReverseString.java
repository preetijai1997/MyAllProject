package com.airtel;

public class ReverseString {

	public static void main(String[] args) {
		String name=reverseName("PreetiVindu");
		System.out.println("Reverse of String is : "+ name);

	}
	
	public static String reverseName(String name)
	{
		String str="";
		for(int i=name.length()-1;i>=0;i--)
		{
			str+=name.charAt(i);
		}
		//System.out.println("Reverse of String is : "+ str);
		return str;
		
	}

}
