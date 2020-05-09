package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListR {

	public static void main(String[] args) {
		
		ArrayList<String> aList=new ArrayList<>();
		
		aList.add("BMW");
		aList.add("Toyota");
		aList.add("Honda");
		aList.add("Citroen");
		
		for(String a:aList) {
			System.out.println(a);
		}
		System.out.println("_______________________________________________");
		for (int i=0; i<aList.size(); i++) {
			String b=aList.get(i);
			System.out.println(b);
		}
		System.out.println("_______________________________________________");
		Iterator <String> it=aList.iterator();
		while (it.hasNext()) {
			String q=it.next();
			System.out.println(q);
		}
		
			
		
	}

}
