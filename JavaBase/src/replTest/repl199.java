package replTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class repl199 {

	  public static void main (String[] args){
	    
	    Map<String,Integer> hmap=new HashMap<String, Integer>();
	    hmap.put("mango", 10); 
	    hmap.put("apple", 30); 
	    hmap.put("orange", 20); 
	    hmap.put("mango", 40); 
	    hmap.put("mango", 40);  
	    
	    Set<Entry<String, Integer>> hmapSet =hmap.entrySet();
	    
	    Iterator<Entry<String, Integer>> it =hmapSet.iterator();
	    while(it.hasNext()) {
	    Entry<String, Integer> q =it.next();
	    System.out.println("key = "+q.getKey()+" and value = "+q.getValue());
	    } 
	  }
	  
	}