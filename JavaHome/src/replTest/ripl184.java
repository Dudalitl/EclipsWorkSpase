package replTest;

import java.util.Iterator;
import java.util.LinkedList;

public class ripl184 {
	
		  public static void main (String[] args){
			  int res=0;
		    LinkedList<Integer> list=new LinkedList<>();
		    list.add(111);
		    list.add(222);
		    list.add(333);
		    list.add(444);
		    list.add(555);
		    list.add(666);
		   // for (int i=0; i<list.size(); i++) {
		    	//res=res+list.get(i);
		    //}
		    
		  // Iterator<Integer> it=list.iterator();
		  // while(it.hasNext()) {
			 //  res=res+it.next();
		   //}
		    
		    for(Integer c:list) {
		    	res=res+c;
		    }
		        
		    System.out.println(res);
		    
		    
		  }

		}