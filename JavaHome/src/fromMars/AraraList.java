package fromMars;

import java.util.ArrayList;
import java.util.Scanner;

public class AraraList {
	  public static void main (String[] args){
		  Scanner sc=new Scanner(System.in);
		  
	    ArrayList<Integer> list= new ArrayList<>();
	    
	    for (int i=0; i<=4; i++) {
	    	int num=sc.nextInt();
	    	list.add(num);
	    	
	    }
	    for(int c:list){
	      System.out.print(c+" ");
	    }
	  }
}
	




