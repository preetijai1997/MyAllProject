package com.airtel;

public class Replace {

	public static void main(String[] args) {
		
		
	
		String name=printChar("Preeti",'e');
		System.out.println("Name of finding char is "+ name);
		String resultSpace=replaceSpaces("Prett i Ja is wal",' ');
		System.out.println("Result is "+ resultSpace);
		
	}
	
	public static String printChar(String s, char ch)
	{
		int count=0;
		String str="";
		for( int i=0; i<s.length();i++)
		{
			
			if(s.charAt(i)!=ch)
			{ 
				count++;
				str=str+s.charAt(i);
			}
		}
		//System.out.println("count is :" +count +" " + str);
		return str;
	}
	
	public static String replaceSpaces(String str, char ch)
	{
		int count=0;
		String res="";
		for( int i=0; i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			{
				count++;
				res+=str.charAt(i);
			}
		}
		//System.out.println("White space is : "+ res);
		return res;
	}

}
