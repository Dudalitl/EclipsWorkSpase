package fromMars;

import java.util.ArrayList;

public class ListOfArray {
	
	public static void main (String[] args){
		  ArrayList<String> list=new ArrayList<>();
		  list.add("hi");
		  list.add("yo");
		  list.add("sup");
		  list.add("yolo");
		  list.add("boop");
		  
		  for (int i=0; i<list.size();i++) {
			  if (!list.get(i).contains("yo")) {
			  list.remove(i);
		  }
		  }
		  for (String c:list) {
			  System.out.print(c+" ");
		  }
		  
		  
	}
		}