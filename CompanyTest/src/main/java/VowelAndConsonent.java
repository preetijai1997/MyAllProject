
public class VowelAndConsonent {
	
	public static void main(String[] args)
	{
		String s="PreetiJaiswal";
		String vowel="";
		String consonent="";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch=='a'||ch=='e'|| ch=='i'||ch=='o'||ch=='u' )
			{
				vowel=vowel+ch;
				count++;
				
			}
			else
			{
				consonent=consonent+ch;
				count++;
			}
		}
		System.out.println("Vowel is "+ vowel);
		System.out.println("Number of vowel is :"+vowel.length());
		System.out.println("Consonent is "+ consonent);
		System.out.println("Number of consonent is :"+consonent.length());
	}

}
