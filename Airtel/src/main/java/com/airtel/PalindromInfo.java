package com.airtel;

public class PalindromInfo {
	String val;
	int length;
	boolean isPalindrom;
	
	public PalindromInfo(String val, int length,boolean isPalindrom)
	{
		
	this.val=val;
	this.length=length;
	this.isPalindrom=isPalindrom;
		
	}
	

	public static void main(String[] args) {
		
		
		//System.out.println(p.val+ " "+p.length);
		String[] s= {"a","aba","aabaa","abcd","aabcc"};
		int max=0;
		for(int i=0;i<s.length;i++)
		{
			PalindromInfo val=isPalindrom(s[i]);	
		//	System.out.println(val.val+" "+ val.length+" "+ val.isPalindrom);
			
			if(val.isPalindrom)
			{
				
				if(max<val.length)
				{
					max=val.length;
				}
				
				//System.out.println(val.val + " "+ val.length);
			}
	
			
			
		}
		
		System.out.println(max);
	}
	
	
	public static PalindromInfo isPalindrom(String s)
	{
		PalindromInfo p;
		//System.out.println(s);
		for(int i=0;i<s.length()/2;i++)
		{
			if(s.charAt(i)!=s.charAt(s.length()-i-1))
			{
				 p= new PalindromInfo(s,s.length(),false);
				return p;
			}
		}
		
		return p=new PalindromInfo(s,s.length(),true);
		
	}
}
