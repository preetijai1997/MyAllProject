package com.airtel;

public class ReverseSentence {

	public static void main(String[] args) {
		
		reverseSentence("My name is preeti");
		reverseSent("Preeti Jaiswal");
	}
	
	public static void reverseSentence(String sent)
	{
		String str="";
		String splitWord[]= sent.split(" ");
		
		for(int i=splitWord.length-1;i>=0;i--)
		
		{
			
			
				str= str+" "+splitWord[i];
		
		}
		
		System.out.println("Reverse of string is : "+ str);
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
	/*
	public static void reverse(String sentence)
	{
		String tempStr="";
		String result="";
		for(int i=0;i<sentence.length();i++)
		{
			if(sentence.charAt(i)!=' ')
			{
				tempStr+=sentence.charAt(i);
				System.out.println(i+" ");
				if(i==sentence.length()-1) 
				{
					String ans=reverseName(tempStr);
					result=result+" "+ans;
					System.out.println("Rev is2 : "+ tempStr+" "+ans+ " "+ result);
					
				}
				
			}
			else if(sentence.charAt(i)==' ')
			{
				//System.out.println("Rev is1 : "+ tempStr+ " abcdxvgg"+ sentence.charAt(i)+" "+ i+ " Length is "+sentence.length());
				if(tempStr!="") {
					String ans=reverseName(tempStr);
					
					result=result+" "+ans;
					System.out.println("Rev is1 : "+ tempStr+ " "+ ans+ " "+ result);
					tempStr="";
				}

				
			}

			
		}
		
	}
	*/
	public static void reverseSent(String val)
	{
		String res="";
		String[] word=val.split(" ");
		
		for(int i=0; i<word.length;i++)
		{
			if(word[i]!="")
			{
			res+=reverseName(word[i]+" ");
			
		}
		}
		String finalResult="";
		for(int i=1; i<res.length();i++)
		{
			finalResult+=res.charAt(i);
	
		}
		System.out.println("Reverse of sent is : "+ finalResult+" "+ finalResult.length()+" "+ res.length()+" "+ val.length());
	}
	

}
