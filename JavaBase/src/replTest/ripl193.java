package replTest;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class ripl193 {

	
		  public static void main (String[] args){
		    
		    Set<String> list=new LinkedHashSet<String>();
		    list.add("null");
		    list.add("Sohil");
		    list.add("Diego");
		    list.add("Alijon");
		    list.add("Asel");
		    list.add("Sumair");
		    
		    for(String c:list){
		      System.out.println(c);
		    }
		    
		    Iterator<String> it=list.iterator();
		    while(it.hasNext()){
		      System.out.println(it.next());
		    }
		    
		  }

		}