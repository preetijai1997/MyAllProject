
package javaprogram;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaTest {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
	    int len=sc.nextInt();
	    ArrayList<Integer> a= new ArrayList<Integer>();
	    
	    for(int i=0;i<len;i++)
	    {
	       int val=sc.nextInt();
	       a.add(val);
	    }
	    reverse(a,len);
	   
	}
	
	public static void reverse(ArrayList<Integer> a, int n)
	{
		
		for(int i=n-1;i>=0;i--)
		{
			System.out.println(a.get(i));
		}
		
		
	}

}
