package com.airtel;

import java.util.LinkedList;

public class ReverseLinkedList {

	public static void main(String[] args) {
		reverseList();
	}
	
	public static void reverseList()
	{
		LinkedList<String> a= new LinkedList<String>();
		a.add("Preeti");
		a.add("Sita");
		a.add("Rajesh");
		LinkedList<String> b=new LinkedList<String>();
		
		
		for(int i=a.size()-1;i>=0;i--)
		{
			b.add(a.get(i));
		}
		System.out.println(b);
	}

}
