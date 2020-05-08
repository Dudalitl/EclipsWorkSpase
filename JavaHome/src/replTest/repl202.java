package replTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class repl202 {

	public static void main(String[] args) {
		
		Map<String, String> hmap=new HashMap<String, String>();
		hmap.put("ONE","AAA");
		hmap.put("TWO","BBB");
		hmap.put("THREE","CCC");
		hmap.put("FOUR","DDD");
		hmap.put("FIVE","EEE");
		
		Set<Entry<String, String>> hmapSet= hmap.entrySet();
		System.out.println("HashMap After Remove :");
//		for(Entry<String, String> q:hmapSet) {
//			System.out.println(q.getKey()+" : "+q.getValue());
//			
//		}
		
		Iterator<Entry<String, String>> it=hmapSet.iterator();
		while(it.hasNext()) {
			Entry<String, String> w =it.next();
			System.out.println(w.getKey()+" : "+w.getValue());
		}
		hmap.replace("THREE", "ASEL");
		hmap.replace("FIVE","SUMAIR");
		System.out.println("---------------------------");
		System.out.println("HashMap After Replace :");
//		for(Entry<String, String> r:hmapSet) {
//		
//			System.out.println(r.getKey()+" : "+r.getValue());
//			
//		}
		Iterator<Entry<String, String>> itr=hmapSet.iterator();
		while(itr.hasNext()) {
			Entry<String, String> w =itr.next();
			System.out.println(w.getKey()+" : "+w.getValue());
	}

}
}
