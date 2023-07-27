package javaprogram;

import java.util.ArrayList;

public class ReverseElement {

	public static void main(String[] args) {
		ArrayList<Integer> al= new ArrayList<Integer>();
		
		al.add(200);
		al.add(400);
		al.add(300);
		al.add(600);
		
		for(int i=al.size()-1;i>=0;i--)
		{
			System.out.println(al.get(i));
		}

	}

}
