
public class CountNumOfLowerCaseAndCountNumOfUpp {

	public static void main(String[] args) {
		String s="Preeti JaIsWAl";
		int lower=0;
		int upper=0;
		
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				upper++;
			}
			else
			{
				lower++;
			}
		}
		System.out.println("No. of lower case: "+lower);
		System.out.println("No. of upper case: "+upper);

	}

}
