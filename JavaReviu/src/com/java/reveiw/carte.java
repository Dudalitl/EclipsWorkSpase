package com.java.reveiw;

public class carte {

	  String model;
	  double price;
	  int quantity;
	  
	  carte(String model, double price, int quantity){
	    this.model=model;
	    this.price=price;
	    this.quantity=quantity;
	  }
	  void carStockValue() {
	    int year=2019;
			double allPrice=0;
	    System.out.println(model+" "+year+" Stock Value "+allPrice);
	  }

	}