package com.airtel;

public class DuplicateCount {

	public static void main(String[] args) {
		duplicateCountString("Preetiiii");
		
	}
	
	public static void duplicateCountString(String val)
	{
		char[] name=val.toCharArray();
		for(int i=0;i<name.length;i++)
		{
			int count=1;
			for(int j=i+1;j<name.length;j++)
			{
				if(name[i]==name[j] && name[j]!='&')
				{
					
					count++;
					name[j]='&';
				}
			}
			if(name[i]!='&' && count>1)
			{
				System.out.println("Count is : "+ count+" "+ name[i]);
			}
		
		}
		
		
	
		
		
	}

}
