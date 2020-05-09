package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class eWords {

	public static void main(String[] args) {
	
		ArrayList<String> words=new ArrayList<>();
		
		words.add("framer");
		words.add("phone");
		words.add("canon");
		words.add("made");
		
		Iterator<String> it=words.iterator();
		while (it.hasNext()) {
			if (it.next().endsWith("e")) {
				it.remove();
				
			}
		}
		System.out.println(words);
	}

}
