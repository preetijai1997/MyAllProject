package com.airtel;

public class lastFourChar {

	public static void main(String[] args) {
		String name=lastFourCaracter("Vindreshaaaa");
		System.out.println(name);

	}
	
	public static String lastFourCaracter(String name)
	{
		String res="";
		
	    for(int i=name.length()-4; i<name.length();i++)
    
	{
		   char result=name.charAt(i);
		   res+=result;
	}
	
	return res;
	}

}
