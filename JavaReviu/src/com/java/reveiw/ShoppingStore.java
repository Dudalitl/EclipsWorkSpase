package com.java.reveiw;

public class ShoppingStore {


		  String item;
		  double price;
		  int quantity;
		  
		  ShoppingStore(String item, double price, int quantity){
		    this.item=item;
		    this.price=price;
		    this.quantity=quantity;
		  }
		  double itemTotalPrice() {
		    double total=price*quantity;
		    System.out.println(item+" Total Value "+ total);
		    return total;
		  }
		  
		  
		}