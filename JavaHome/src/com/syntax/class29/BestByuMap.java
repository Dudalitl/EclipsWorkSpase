package com.syntax.class29;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

//Create a map of Best Buy store.
//Place item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )

//Retrieve all keys and values from a Best Buy map using EntrySet.

public class BestByuMap {

	public static void main(String[] args) {
		
		Map<Integer,String> bestBuy=new TreeMap<>();
		bestBuy.put(10, "Printer");
		bestBuy.put(12, "TV");
		bestBuy.put(15, "Vakum");
		bestBuy.put(17, "Smart Phone");
		bestBuy.put(19, "Laptop");
		
		System.out.println(bestBuy);
		
		Set<Entry<Integer,String>> best=bestBuy.entrySet();
		
		Iterator<Entry<Integer,String>>it=best.iterator();
		while(it.hasNext()) {
			Entry<Integer, String> c=it.next();	
			String buy=c.getKey()+"==="+c.getValue();
			System.out.println(buy);
			
		}
		
	}

}
