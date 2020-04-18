package com.java.reveiw;

public class ShoppingTest {


		  public static void main (String[] args){
		    
		    ShoppingStore obj1=new ShoppingStore("Blanket", 5, 10);
		    ShoppingStore obj2=new ShoppingStore("Mattress", 5, 10);
		    
		    //obj1.itemTotalPrice();
		    //obj2.itemTotalPrice();
		    
		    System.out.println(obj1.itemTotalPrice()+obj2.itemTotalPrice());
		    
		  }
		  
		}