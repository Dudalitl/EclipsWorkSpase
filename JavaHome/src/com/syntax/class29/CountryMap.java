package com.syntax.class29;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class CountryMap {

	public static void main(String[] args) {
		
		Map<String,String>countrie=new HashMap<>();
		countrie.put("USA", "Washington DC");
		countrie.put("Belarus", "Minsk");
		countrie.put("Russia", "Moskow");
		countrie.put("France", "Paris");
		countrie.put("German", "Berlin");
		countrie.put("Italia", "Rome");
		
		System.out.println(countrie);
		System.out.println("--------------------------------------------");
		
		
		Map<String,String>alfabetSort=new TreeMap<>(countrie);
		System.out.println(alfabetSort);
		System.out.println("============================================");
		
		for (String c:countrie.keySet()) {
			System.out.println("Countri "+c);
		}
		for (String d:countrie.values()) {
			System.out.println("City "+d);
		}
		for (Entry<String, String> e:countrie.entrySet()) {
			System.out.println(e);
		}
			
		}
		
	}

