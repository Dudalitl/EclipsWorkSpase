package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

//create a collection of food and using 3 ways execute methods
public class FoodTest {
	


	public static void main(String[] args) {
		
		//Food [] foodArray={new Bread("Bread"), new Apple("Apple"), new Ham("Ham"), new Potato("Potato")};
		
		 ArrayList<Food> foodList=new ArrayList<>();
		 foodList.add(new Bread("Bread"));
		 foodList.add(new Potato("Potato"));
		 foodList.add(new Ham("Ham"));
		 foodList.add(new Apple("Apple"));
		 
		 for (int i=0; i<foodList.size(); i++) {
		 foodList.get(i).mt1();
		 foodList.get(i).mt2();
		 foodList.get(i).mt3();
		 }
		 System.out.println("22222222222222222222222222222222222222");
		 for(Food c:foodList) {
			 c.mt1();
			 c.mt2();
			 c.mt3();
		 }
		 System.out.println("33333333333333333333333333333333333333");
		 
		 Iterator<Food> it=foodList.iterator();
		 while (it.hasNext()) {
			 Food itStr=it.next();
			 itStr.mt1();
			 itStr.mt2();
			 itStr.mt3();
			 
		 }

	}

}
