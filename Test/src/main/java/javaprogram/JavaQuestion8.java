package javaprogram;

import java.util.ArrayList;

public class JavaQuestion8 {

	public static void main(String[] args) {
		//Write code that creates an ArrayList that can hold string objects. Add the names of three cars to the ArrayList, and then display the contents of the ArrayList.
		
		ArrayList<String> a= new ArrayList<String>();
		a.add("Preeti");
		a.add("Love");
		a.add("Vindu");
		
		for(int i=0;i<a.size();i++)
		{
			System.out.println("ArrayList element are : "+ a.get(i));
		}
		
		
	}

}
