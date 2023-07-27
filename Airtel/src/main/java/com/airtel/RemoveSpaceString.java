package com.airtel;

public class RemoveSpaceString {

	public static void main(String[] args) {
		String name=removeSpace("Pr  ee t  i  Jai  s wal");
		System.out.println("After remove string is : "+ name);
	}
	
	public static String removeSpace(String name)
	{
		String str="";
		
		for(int i=0;i<name.length();i++)
		{
			if(name.charAt(i)!= ' ')
			{
				str+=name.charAt(i);
			}
		}
		return str;
	}

}
