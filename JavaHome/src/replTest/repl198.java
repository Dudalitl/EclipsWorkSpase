package replTest;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class repl198 {

	public static void main(String[] args) {
	
		    Map<String, String> lmap=new LinkedHashMap<String, String>();
		    lmap.put("1 item", "apple");
		    lmap.put("2 item", "banana");
		    lmap.put("3 item", "pear");
		    lmap.put("4 item", "tomato");
		    lmap.put("5 item", "mango");
		    lmap.put("6 item", "kiwi");
		    
		    Set<Entry<String, String>> lmapSet=lmap.entrySet();
		    
		    Iterator<Entry<String, String>> it=lmapSet.iterator();
		    while(it.hasNext()) {
		    	Entry<String, String>e=it.next();
		    	System.out.println("Key is "+e.getKey()+" and values is "+e.getValue());
		    	
		    }
		        
		    
		  }

		}