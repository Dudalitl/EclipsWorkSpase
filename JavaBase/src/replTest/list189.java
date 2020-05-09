package replTest;

import java.util.ArrayList;

public class list189 {

	public static void main(String[] args) {
		
		ArrayList<Boolean> listA=new ArrayList<>();
		listA.add(true);
		listA.add(false);
		listA.add(false);
		
		ArrayList<Boolean> listB=new ArrayList<>();
		//listB=(ArrayList)listA.clone();	
		//System.out.println(listB);
		
		for (Boolean c:listA) {
			listB.add(c);
			
		}
		System.out.println(listB);
		
	}
		
		
		
		

	}


