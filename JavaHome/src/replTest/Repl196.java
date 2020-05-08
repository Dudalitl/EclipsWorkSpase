package replTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

//Create a Map in which you do not need to preserve the order of the entries
//Add below pair to it . 
//
//"Street" = "Patrick ST"
//"Suite" = "265"
//"City" = "Vienna"
//"Zip" = "22180"
//"Country" = "United State"
//
//Find how many entries are inside the map
//Remove all entires from the Map
//Find the Map size again
public class Repl196 {

	public static void main(String[] args) {
		
		Map<String, String> hmap=new LinkedHashMap<String, String>();
		
		hmap.put("Striit", "Patrick ST");
		hmap.put("Suite", "265");
		hmap.put("City", "Vienna");
		hmap.put("Zip", "22180");
		hmap.put("Countrie", "United State");
		
		System.out.println(hmap.size());
		
		Iterator<String> it=hmap.values().iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		hmap.clear();
		System.out.println(hmap.size());
		
		
		
	}

}
