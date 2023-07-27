package String;

import java.util.ArrayList;

public class FrequencyCountName {

	public static void main(String[] args) {
		
		ArrayList<String> countFreq=charCount("Preeiti");
		System.out.print(countFreq);
		System.out.println();
		
	}
	
	public static ArrayList<String> charCount(String s)
	{
		ArrayList<String> freq= new ArrayList<String>();
		String name="preeti";
		 char[] ch = name.toCharArray();
		for(int i=0; i<name.length();i++)
		{
			
			int count=0;
			char b=ch[i];
			for(int j=0; j<name.length();j++)
			{
				if((b==ch[j])&&(ch[j]!='$'))
				{
					count++;
					ch[j]='$';
				}
			
			}
			if(b!='$')
			
			freq.add(b+ " "+ count);
		}
		
		
		return freq;
		
	}

}
