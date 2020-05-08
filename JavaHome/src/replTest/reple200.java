package replTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class reple200 {

	public static void main(String[] args) {
		
		
		    
		    Map<String, String> hmap=new HashMap<String, String>();
		    
		    hmap.put("Striit", "Patrick ST");
			hmap.put("Suite", "265");
			hmap.put("City", "Vienna");
			hmap.put("Zip", "22180");
			hmap.put("Countrie", "United State");
			
			Set<Entry<String,String>> hmapSet=hmap.entrySet();
			
			
			
			Iterator<Entry<String, String>> it=hmapSet.iterator();
			while (it.hasNext()) {
				//System.out.println(it.next());
				Entry<String, String> w=it.next();
				System.out.println(w.getValue().toUpperCase());
			}
	}

}
