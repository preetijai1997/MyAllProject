package javaprogram;

import java.util.ArrayList;

public class removeEleAtSepecifiedIndex {

	public static void main(String[] args) {
		
		ArrayList<Integer> a= new ArrayList<Integer>();
		a.add(300);
		a.add(500);
		
		ArrayList<String> al= new ArrayList<String>();
		al.add("Preeti");
		al.add("Swati");
		
		a.set(1, 700);
		al.set(0, "Tushar");
		
		System.out.println("Replace Int" + a);
		System.out.println("Replace String" + al);
        		
		

	}

}
