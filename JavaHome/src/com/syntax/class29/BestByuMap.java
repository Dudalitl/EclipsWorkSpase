package com.syntax.class29;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//Create a map of Best Buy store.
//Place item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )

//Retrieve all keys and values from a Best Buy map using EntrySet.

public class BestByuMap {

	public static void main(String[] args) {
		
		Map<Integer,String> bestBuy=new HashMap<>();
		bestBuy.put(7664847, "Printer");
		bestBuy.put(7664963, "TV");
		bestBuy.put(7645298, "Vakum");
		bestBuy.put(7678452, "Smart Phone");
		bestBuy.put(7845129, "Laptop");
		
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
