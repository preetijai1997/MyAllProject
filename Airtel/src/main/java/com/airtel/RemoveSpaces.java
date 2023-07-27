package com.airtel;

public class RemoveSpaces {
	
	public static void main(String[] args)
	{
		String a="Preeti H ow A re Yo u";
		
		a=a.replaceAll("\\s", "");
		System.out.println(a);
	}

}
