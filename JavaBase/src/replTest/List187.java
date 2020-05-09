package replTest;

import java.util.Iterator;
import java.util.LinkedList;

public class List187 {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<>();
		for(int i=50; i<=100; i++) {
			list.add(i);
		}
		System.out.println(list);
		Iterator<Integer> it=list.iterator();
		while(it.hasNext()) {
			if (it.next()%3!=0) {
				it.remove();
			}
		}
		System.out.println(list);
		
	}
}
