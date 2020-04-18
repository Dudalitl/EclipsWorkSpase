package com.java.reveiw;

public class CarObjects {

		  String model;
		  double price;
		  int quantity;

		  
		  CarObjects(String model, double price, int quantity){
		    this.model=model;
		    this.price=price;
		    this.quantity=quantity;
		    
		  }
		  void carStockValue() {
			  int year=2019;
			  double allPrice;
			  allPrice=quantity*price;
		    System.out.println(model+" "+year+" Stock Value "+allPrice);
		  }
		  
		}