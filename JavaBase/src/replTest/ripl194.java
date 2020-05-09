package replTest;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class ripl194 {

	public static void main(String[] args) {
		
		Set<SList> hlist=new LinkedHashSet();
		
		hlist.add(new SList("101", "Samir", "Jawaid"));	
		hlist.add(new SList("102", "Asel","Umurzakova"));
		hlist.add(new SList("103", "Diego","Juarez"));
		hlist.add(new SList("104", "Sohil","Aryan"));
		hlist.add(new SList("105", "Alijon","Nazarov"));

		Iterator<SList> it=hlist.iterator();
		while(it.hasNext()) {
			SList obj=it.next();
			obj.method();
		}
		
		
	}

}
